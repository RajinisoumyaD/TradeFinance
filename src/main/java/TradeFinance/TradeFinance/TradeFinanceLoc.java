package TradeFinance;

@DataType()
public class TradeFinanceLoc {

    @Property()
    private String id;

    @Property()
    private String buyer;

    @Property()
    private String buyersBank;

    @Property()
    private String seller;

    @Property()
    private String sellersBank;

    @Property()
    private double amount;

    @Property()
    private String status;

    @Property()
    private LocDate requestedDate;

    @Property()
    private LocDate expiryDate;

    @Property()
    private LocDate issuedDate;

    @Property()
    private LocDate acceptedDate;

    // Getters and setters
    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getBuyer() { return buyer; }

    public void setBuyer(String buyer) { this.buyer = buyer; }

    public String getBuyersBank() { return buyersBank; }

    public void setBuyersBank(String buyersBank) { this.buyersBank = buyersBank; }

    public String getSeller() { return seller; }

    public void setSeller(String seller) { this.seller = seller; }

    public String getSellersBank() { return sellersBank; }

    public void setSellersBank(String sellersBank) { this.sellersBank = sellersBank; }

    public double getAmount() { return amount; }

    public void setAmount(double amount) { this.amount = amount; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public LocDate getRequestedDate() { return requestedDate; }

    public void setRequestedDate(LocDate requestedDate) { this.requestedDate = requestedDate; }

    public LocDate getExpiryDate() { return expiryDate; }

    public void setExpiryDate(LocDate expiryDate) { this.expiryDate = expiryDate; }

    public LocDate getIssuedDate() { return issuedDate; }

    public void setIssuedDate(LocDate issuedDate) { this.issuedDate = issuedDate; }

    public LocDate getAcceptedDate() { return acceptedDate; }

    public void setAcceptedDate(LocDate acceptedDate) { this.acceptedDate = acceptedDate; }
}
