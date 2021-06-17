package com.example.springbootformexample.model;

public class BankAccount {

    static int counter = 0;

    private int accountNumber;
    private int balanceAccount;
    private String customerName;
    private String email;
    private int phone;

    public BankAccount(int balanceAccount, String customerName, String email, int phone) {
        this.accountNumber = ++counter;
        this.balanceAccount = balanceAccount;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }



    public int deposit(int amount){
        this.balanceAccount = this.balanceAccount + amount;
        return balanceAccount;
    }

    public int withdraw(int amount) {
        if (amount <= balanceAccount) {
            balanceAccount = balanceAccount - amount;
        }
            return balanceAccount;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalanceAccount() {
        return balanceAccount;
    }

    public void setBalanceAccount(int balanceAccount) {
        this.balanceAccount = balanceAccount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
