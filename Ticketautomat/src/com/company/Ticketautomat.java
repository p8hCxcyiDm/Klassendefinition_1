package com.company;

public class Ticketautomat
{
    private int preis;
    private int bisherGezahlt;
    private int gesamtsumme;

    public Ticketautomat(int preis)
    {
        this.preis = preis;
        this.bisherGezahlt = 0;
        this.gesamtsumme = 0;
    }

    public int getPreis()
    {
        return preis;
    }

    public int getBisherGezahlt()
    {
        return bisherGezahlt;
    }

    public int getGesamtsumme()
    {
        return gesamtsumme;
    }

    public static void main(String[] args)
    {

    }
}
