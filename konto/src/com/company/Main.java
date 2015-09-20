package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Account testAccount = new Account("Max Meier", 3);
        testAccount.incBalance(4000);
        System.out.println(testAccount.interestPerAnnum());
        testAccount.printAccount();
    }
}
