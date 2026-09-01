# Simple Banking System

## Goal

Complete all unfinished methods and make `MainBank.java` produce correct console output.

Do not redesign the project. Use the existing classes, methods, and structure.

## Student Tasks

Complete the TODO methods in:

- `CardTransaction`
- `BankAccountTransaction`

## Methods To Complete

### CardTransaction

```java
public void deposit(Account account, double amount)
public void withdraw(Account account, double amount)
public void transfer(Account fromAccount, Account toAccount, double amount)
public double checkBalance(Account account)
public void blockCard(CardAccount cardAccount)
```

Rules:

- Do not deposit money if the card is blocked.
- Do not withdraw money if the card is blocked.
- Do not withdraw money if there is not enough balance.
- Do not transfer money if the card is blocked.
- Do not transfer money if there is not enough balance.
- `checkBalance` should return the card balance.
- `blockCard` should change the card status to `BLOCKED`.

### BankAccountTransaction

```java
public void deposit(Account account, double amount)
public void withdraw(Account account, double amount)
public void transfer(Account fromAccount, Account toAccount, double amount)
public double checkBalance(Account account)
```

Rules:

- Deposit is allowed for debit bank accounts.
- Withdraw is allowed for credit bank accounts.
- Do not withdraw money if there is not enough balance.
- Transfer should move money from a debit account to a credit account.
- Do not transfer money if there is not enough balance.
- `checkBalance` should return the bank account balance.

## Main Task Flow

Students should implement the TODO methods so the app can:

- Check a card balance.
- Check a bank account balance.
- Deposit money into a card.
- Withdraw money from a card.
- Send money from one card to another card.
- Deposit money into a bank account.
- Withdraw money from a bank account.
- Send money from one bank account to another bank account.
- Throw custom exceptions when a transaction is not allowed.

## Concepts To Identify

Students should be able to explain where each OOP concept is used.

### Class

```text
Address
CardHolder
Bank
```

### Abstract Class

```text
Account
```

### Interface

```text
Transaction
```

### Inheritance

```text
CardAccount extends Account
BankAccount extends Account
```

### Encapsulation

All fields should remain private.

### Enum

```text
CardType
CardStatus
Currency
BankAccountType
```

### Association

```text
CardHolder has an Address
CardHolder has a BankAccount
Bank has an Address
```

### Aggregation

```text
CardHolder contains card accounts
Bank contains card holders
```

### Polymorphism

```java
Transaction cardTransaction = new CardTransaction();
Transaction bankAccountTransaction = new BankAccountTransaction();
```

The same method names are used with different transaction implementations.

## Restrictions

Do not use:

```text
Stream API
Spring
Database
Hibernate
Lombok
External frameworks
```

Use:

```text
classes
objects
constructors
getters/setters
ArrayList
loops
if statements
custom exceptions
interfaces
abstract classes
method overriding
```
