package com.abc;

import java.util.Date;

public class Transaction {
    public final double amount;

    private Date transactionDate;

    public Transaction(double amount) {
        this.amount = amount;
        transactionDate = DateProvider.getInstance().now();
        //System.out.println("trans date"+transactionDate);
    }

}
