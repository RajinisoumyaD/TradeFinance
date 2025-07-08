package TradeFinance;

@Contract(name = "TradeFinance")
public class TradeFinanceContract implements ContractInterface {

    @Transaction()
    public void requestLoc(Context ctx, String id, String buyer, String buyersBank, String seller,
                           String sellersBank, String amount, String requestedDay, String requestedMonth,
                           String requestedYear, String expiryDay, String expiryMonth, String expiryYear) {

        ChaincodeStub stub = ctx.getStub();

        TradeFinanceLoc loc = new TradeFinanceLoc();
        loc.setId(id);
        loc.setBuyer(buyer);
        loc.setBuyersBank(buyersBank);
        loc.setSeller(seller);
        loc.setSellersBank(sellersBank);
        loc.setAmount(Double.parseDouble(amount));
        loc.setStatus("Requested");

        LocDate requestedDate = new LocDate(Integer.parseInt(requestedDay), Integer.parseInt(requestedMonth), Integer.parseInt(requestedYear));
        LocDate expiryDate = new LocDate(Integer.parseInt(expiryDay), Integer.parseInt(expiryMonth), Integer.parseInt(expiryYear));

        loc.setRequestedDate(requestedDate);
        loc.setExpiryDate(expiryDate);

        stub.putStringState(id, Utils.toJson(loc));
    }

    @Transaction()
    public void issueLoc(Context ctx, String id, String issuedDay, String issuedMonth, String issuedYear) {
        ChaincodeStub stub = ctx.getStub();
        String data = stub.getStringState(id);
        TradeFinanceLoc loc = Utils.fromJson(data, TradeFinanceLoc.class);

        if (!"Requested".equals(loc.getStatus())) {
            throw new RuntimeException("LOC is not in Requested state");
        }

        LocDate issuedDate = new LocDate(Integer.parseInt(issuedDay), Integer.parseInt(issuedMonth), Integer.parseInt(issuedYear));

        if (loc.getRequestedDate().after(issuedDate)) {
            throw new RuntimeException("Issued date cannot be before requested date");
        }

        if (issuedDate.after(loc.getExpiryDate())) {
            throw new RuntimeException("Issued date cannot be after expiry date");
        }

        loc.setIssuedDate(issuedDate);
        loc.setStatus("Issued");

        stub.putStringState(id, Utils.toJson(loc));
    }

    @Transaction()
    public void acceptLoc(Context ctx, String id, String acceptedDay, String acceptedMonth, String acceptedYear) {
        ChaincodeStub stub = ctx.getStub();
        String data = stub.getStringState(id);
        TradeFinanceLoc loc = Utils.fromJson(data, TradeFinanceLoc.class);

        if (!"Issued".equals(loc.getStatus())) {
            throw new RuntimeException("LOC is not in Issued state");
        }

        LocDate acceptedDate = new LocDate(Integer.parseInt(acceptedDay), Integer.parseInt(acceptedMonth), Integer.parseInt(acceptedYear));

        if (loc.getIssuedDate().after(acceptedDate)) {
            throw new RuntimeException("Accepted date cannot be before issued date");
        }

        if (acceptedDate.after(loc.getExpiryDate())) {
            throw new RuntimeException("Accepted date cannot be after expiry date");
        }

        loc.setAcceptedDate(acceptedDate);
        loc.setStatus("Accepted");

        stub.putStringState(id, Utils.toJson(loc));
    }

    @Transaction()
    public String readLoc(Context ctx, String id) {
        ChaincodeStub stub = ctx.getStub();
        return stub.getStringState(id);
    }
}
