package org.andresdominguez.dev.classes;

public class Transaction {
    // The ID of the transaction
    private int id;
    // The amount of the transaction
    private double amount;

    // Constructor
    public Transaction(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    // Get the transaction ID
    public int getId() {
        return id;
    }

    // Get the transaction amount
    public double getAmount() {
        return amount;
    }

    // Set the transaction amount
    public void setAmount(double amount) {
        this.amount = amount;
    }
}


