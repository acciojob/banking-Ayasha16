package com.driver;

public class Main {
    public static void main(String[] args) throws Exception {

        BankAccount acc1 = new BankAccount("Ayasha",10000,1000);
        System.out.println(acc1.generateAccountNumber(3,22));

        SavingsAccount  s1 = new SavingsAccount("Fiza",20000,5000,5);
        s1.withdraw(500);
        System.out.println(s1.getSimpleInterest(4));
        System.out.println(s1.getCompoundInterest(1,4));;

        CurrentAccount c1 = new CurrentAccount("Kaif",25000,"ABCDEF");
        c1.validateLicenseId();

    }
}