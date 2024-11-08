package com.rachelpzm.POO.aula04;

public class AccountHolder extends Person {
    private String agency;
    private String account;
    private double currentBalance;
    private double loanAmount;
    private double valueDebt;


    public AccountHolder(String name, String lasName, int age, String agency, String account, double currentBalance) {
        super(name, lasName, age);
        this.agency = agency;
        this.account = account;
        this.currentBalance = currentBalance;
        this.loanAmount = calculateLoanAmount(age);
    }

    public AccountHolder(String name, String lasName, int age, String agency, String account) {
        this(name, lasName, age, agency, account, 0.0);
    }

    private double calculateLoanAmount(int age){
        return age <= 18 || age >= 60 ? 2500 : 5000;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        if(super.checkWord(agency)){
            this.agency = agency;
        }

    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        if(super.checkWord(account)){
            this.account = account;
        }

    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void putMoney(double money) {
        this.currentBalance += money;
    }

    public void withdrawMoney(double money) {
        if(this.currentBalance - money <= 0){
            throw new IllegalArgumentException("Cannot be zero or negative");
        }

        this.currentBalance -= money;
    }

    public double getLoanAmount() {
        return loanAmount;
    }


    public double getValueDebt() {
        return valueDebt;
    }

    public void applyBankLoan(){
        if (this.loanAmount != 0){
            this.currentBalance += this.loanAmount;
            this.valueDebt += this.loanAmount * 1.2;
            this.loanAmount = 0;

            System.out.printf("Bank Loan applied.%n> Current Balance $ %.2f%n> Value Debt: $ %.2f%n%n", this.currentBalance, this.valueDebt);

        } else {
            System.out.println("You don't have bank loan to apply.");
        }

    }

    public void payValueDebt(){
        if(this.valueDebt != 0){
            if(this.currentBalance >= this.valueDebt){
                this.currentBalance -= this.valueDebt;
                this.valueDebt = 0;

                System.out.print("Debt paid.");

            } else {
                System.out.printf("You don't have enough. It's missing $ %.2f%n", this.valueDebt - this.currentBalance);

            }
        } else {
            System.out.println("You don't have debt to paid.");

        }
    }

    public void status(){
        String personalInfo = "%n--- ACCOUNT STATUS------->%n" + "Full Name: %s %s%n" + "Age: %d%n" + "Full Account: %s/%s%n";
        String accountInfo = "Current Balance: $ %.2f%n" + "Valid Loan: %.2f%n" + "Current Debt: %.2f%n";

        System.out.printf(personalInfo + accountInfo,super.getName(), super.getLastName(), super.getAge(), this.agency, this.account, this.currentBalance, this.loanAmount, this.valueDebt);
    }


}
