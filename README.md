# TradeFinance Chaincode for Hyperledger Fabric

🚀 A blockchain-based Trade Finance application built using Hyperledger Fabric and Java Chaincode. It enables secure, transparent, and automated handling of Letters of Credit (LoC) between trade participants like buyers, sellers, and banks.

---

## 📌 Features

- Create, issue, and accept Letters of Credit (LoC)
- Tracks status: Requested → Issued → Accepted
- Immutable history of LoC transactions
- Encodes business logic as smart contracts using Fabric Java SDK

---

## 🏗️ Project Structure

TradeFinance/
├── build.gradle
├── settings.gradle
└── src
└── main
└── java
└── TradeFinance
├── TradeFinanceContract.java
├── TradeFinanceLoc.java
├── LocDate.java
└── Utils.java


---

## ⚙️ Tech Stack

- Hyperledger Fabric Java Chaincode Shim `v2.5.0`
- Java 11
- Gradle Build Tool
- Gson for JSON serialization
- VS Code for development

---

🔐 Key Java Classes

| File                        | Purpose                                                                |
| --------------------------- | ---------------------------------------------------------------------- |
| `TradeFinanceContract.java` | Chaincode logic: create, issue, accept LoCs                            |
| `TradeFinanceLoc.java`      | LoC model: attributes like buyer, seller, banks, amount, status, dates |
| `LocDate.java`              | Utility class to handle LoC-related date formatting and comparisons    |
| `Utils.java`                | JSON (de)serialization using Gson                                      |

---


🤝 Participants

**-Buyer

**-Seller

**-Buyer's Bank

**-Seller's Bank

Each party interacts through transactions defined in the smart contract.

---

📜 License
This project is licensed under the MIT License.

---

## ✨ Author

Rajinisoumya D

Blockchain Developer | Web3 Enthusiast

---

