package com.company;

public class Main
{
    public static void main(String[] args)
    {
        account testAccount = new account("Max Meier", 3);
        testAccount.incBalance(4000);
        System.out.println(testAccount.interestPerAnnum());
        testAccount.printAccount();
    }
}
