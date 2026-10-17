package com.oop;

public class Main {
   public static void main(String[] args){
        BankAccount jacobsAccount = new BankAccount();
        jacobsAccount.accountHolder = "jacob";
        jacobsAccount.balance = 100;

        BankAccount patricksAccount =new BankAccount();

        System.out.println("Before Deposit: "  + jacobsAccount.balance);
        jacobsAccount.deposit (400);
        System.out.println("After Deposit: " + jacobsAccount.balance);
        System.out.println("Balance is: " + patricksAccount.balance);
    }
    

}