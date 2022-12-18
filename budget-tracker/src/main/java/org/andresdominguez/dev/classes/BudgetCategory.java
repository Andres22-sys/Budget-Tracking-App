package org.andresdominguez.dev.classes;

public class BudgetCategory {
    // Define the budget category class
    private String name;
    private double budgetedAmount;
    private double actualAmount;

    // Create a new budget category object
    public BudgetCategory(String name, double budgetedAmount) {
        this.name = name;
        this.budgetedAmount = budgetedAmount;
        this.actualAmount = 0;
    }

    // Get the name of the budget category
    public String getName() {
        return name;
    }

    // Get the budgeted amount for the budget category
    public double getBudgetedAmount() {
        return budgetedAmount;
    }

    // Get the actual amount for the budget category
    public double getActualAmount() {
        return actualAmount;
    }

    // Add a transaction to the budget category
    public void addTransaction(double amount) {
        actualAmount += amount;
    }

    // Remove a transaction from the budget category
    public void removeTransaction(double amount) {
        actualAmount -= amount;
    }

    // Edit a transaction in the budget category
    public void editTransaction(double oldAmount, double newAmount) {
        actualAmount -= oldAmount;
        actualAmount += newAmount;
    }
}
