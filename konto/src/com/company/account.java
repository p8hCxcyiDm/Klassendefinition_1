package com.company;

/**
 * Represents a bank-account
 *
 * Created by daellsam on 20.09.2015.
 */
public class account
{
    String nameOwner;
    int balance;
    int interestRate;

    /**
     * Create account, set the balance to 0 and the interest rate to 2%
     * @param nameOwner
     */
    public account(String nameOwner)
    {
        this.nameOwner = nameOwner;
        this.balance = 0;
        this.interestRate = 2;
    }

    /**
     * Create account and set the balance to 0
     * @param nameOwner
     * @param interestRate
     */
    public account(String nameOwner, int interestRate)
    {
        this.nameOwner = nameOwner;
        this.interestRate = interestRate;
    }

    /**
     * Get the interest Rate
     * @return interest Rate
     */
    public int getInterestRate()
    {
        return interestRate;
    }

    /**
     * Set the interest Rate
     * @param interestRate
     */
    public void setInterestRate(int interestRate)
    {
        this.interestRate = interestRate;
    }

    /**
     * Increment the balance
     * @param increment the amount to increment
     */
    public void incBalance(int increment)
    {
        this.balance += increment;
    }

    /**
     * Decrement the balance
     * @param decrement the amount to decrement
     */
    public void decBalance(int decrement)
    {
        this.balance -= decrement;
    }

    /**
     * Calculate the current interest
     * @return
     */
    public int interestPerAnnum()
    {
        int returnValue;
        returnValue = balance * interestRate / 100;
        return returnValue;
    }

    /**
     * Print account informations
     */
    public void printAccount()
    {
        System.out.println("Informationen zum Konto:");
        System.out.println("Kontoinhaber: " + nameOwner);
        System.out.println("Kontostand: CHF " + balance);
        System.out.println("Zinssatz: " + interestRate + "%");
    }
}
