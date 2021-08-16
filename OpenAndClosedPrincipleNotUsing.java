package com.keyword;

class Payment
{
    public void paymentProcessing(int amount , String mode)
    {
        if(mode.equals("Cash"))
        {
            System.out.println("Amount is cash type");
        }
        else if(mode.equals("Debit"))
        {
            System.out.println("Amount through debit.");
        }
        else if(mode.equals("Credit"))
        {
            System.out.println("Amount through credit.");
        }
    }
}

public class OpenAndClosedPrincipleNotUsing
{
    public static void main(String[] args)
    {
        Payment payment = new Payment();
        payment.paymentProcessing(100,"Cash");
        payment.paymentProcessing(100,"Debit");
        payment.paymentProcessing(100,"Credit");
    }
}

