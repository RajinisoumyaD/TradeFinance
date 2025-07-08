# TradeFinance Chaincode for Hyperledger Fabric

## Overview

**TradeFinance** is a blockchain-based application that streamlines and secures the trade finance process using Hyperledger Fabric and Java Chaincode. The solution focuses on automating and digitizing the creation, issuance, and acceptance of Letters of Credit (LC), providing transparency, efficiency, and trust among buyers, sellers, and their respective banks.

---

## Problem Statement

Traditional trade finance processes face several critical challenges:

- **Paper-Intensive Workflow:** The current Letter of Credit process relies heavily on physical documents exchanged between importers, exporters, and their banks. This leads to high costs, time delays, and the risk of document loss, errors, or forgery.
- **Delayed Payments:** Payment cycles are slowed down by multiple intermediaries and manual verification steps, delaying the disbursement of funds to the exporter.
- **Invoice Factoring Risks:** Exporters may use the same invoice for short-term financing from multiple banks, increasing financial risk if goods are not delivered.
- **Version Control Issues:** With multiple parties modifying and exchanging financial documents, inconsistencies and disputes often arise due to a lack of a single source of truth.

---

## Solution

**TradeFinance** addresses these challenges by leveraging blockchain technology to deliver:

- **Digital, Immutable Records:** All LC transactions and document exchanges are securely recorded on a tamper-proof ledger.
- **Automated Workflow:** Smart contracts automate the lifecycle of Letters of Credit, reducing delays and human errors.
- **Single Source of Truth:** All participants rely on the same, real-time data, eliminating version control issues and disputes.
- **Enhanced Transparency and Security:** Every action is traceable, auditable, and protected from unauthorized alterations.

---

## Features

- **Create, Issue, and Accept Letters of Credit (LC)**
- **Track LC Status:** Requested → Issued → Accepted
- **Immutable Transaction History:** All actions are securely logged for audit and compliance.
- **Smart Contract Business Logic:** Encapsulated using Fabric’s Java SDK.

---

## Project Structure

```
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
```

---

## Tech Stack

- **Hyperledger Fabric Java Chaincode Shim v2.5.0**
- **Java 11**
- **Gradle Build Tool**
- **Gson** for JSON serialization
- **Visual Studio Code** for development

---

## Key Components

| File                     | Description                                                                   |
|--------------------------|-------------------------------------------------------------------------------|
| TradeFinanceContract.java| Implements chaincode logic for LC lifecycle management                        |
| TradeFinanceLoc.java     | Defines the LC data model (buyer, seller, banks, amount, status, dates)       |
| LocDate.java             | Utility for LC-related date formatting and comparison                         |
| Utils.java               | JSON (de)serialization support using Gson                                     |

---

## Participants

- **Buyer**
- **Seller**
- **Buyer's Bank**
- **Seller's Bank**

Each party interacts via transactions defined in the smart contract, ensuring a seamless and secure process.

---

## License

This project is licensed under the [MIT License](LICENSE).

---

## Author

**Rajinisoumya D**  
Blockchain Developer | Web3 Enthusiast

---
