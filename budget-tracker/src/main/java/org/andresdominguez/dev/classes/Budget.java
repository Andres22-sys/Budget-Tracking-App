package org.andresdominguez.dev.classes;

import java.util.ArrayList;

public class Budget {
    // A list of budget categories
    private ArrayList<BudgetCategory> categories;

    // Create a new budget object
    public Budget() {
        categories = new ArrayList<BudgetCategory>();
    }

    // Add a new budget category
    public void addCategory(BudgetCategory category) {
        categories.add(category);
    }

    // Add a new transaction
    public void addTransaction(String categoryName, double amount) {
        for (BudgetCategory category : categories) {
            if (category.getName().equals(categoryName)) {
                category.addTransaction(amount);
            }
        }
    }

    // Remove a transaction
    public void removeTransaction(String categoryName, double amount) {
        for (BudgetCategory category : categories) {
            if (category.getName().equals(categoryName)) {
                category.removeTransaction(amount);
            }
        }
    }

    // Edit a transaction
    public void editTransaction(String categoryName, double oldAmount, double newAmount) {
        for (BudgetCategory category : categories) {
            if (category.getName().equals(categoryName)) {
                category.editTransaction(oldAmount, newAmount);
            }
        }
    }

    // Get the budgeted amount for a category
    public double getBudgetedAmount(String categoryName) {
        for (BudgetCategory category : categories) {
            if (category.getName().equals(categoryName)) {
                return category.getBudgetedAmount();
            }
        }
        return 0;
    }

    // Get the actual amount for a category
    public double getActualAmount(String categoryName) {
        for (BudgetCategory category : categories) {
            if (category.getName().equals(categoryName)) {
                return category.getActualAmount();
            }
        }
        return 0;
    }

    // Get the list of budget categories
    public ArrayList<BudgetCategory> getCategories() {
        return categories;
    }

    // Get the total budgeted amount
    public double getTotalBudgetedAmount() {
        double total = 0;
        for (BudgetCategory category : categories) {
            total += category.getBudgetedAmount();
        }
        return total;
    }

    // Get the total actual amount
    public double getTotalActualAmount() {
        double total = 0;
        for (BudgetCategory category : categories) {
            total += category.getActualAmount();
        }
        return total;
    }

    // Get the total remaining amount
    public double getTotalRemainingAmount() {
        return getTotalBudgetedAmount() - getTotalActualAmount();
    }

    // Get the percentage of the budget that has been spent
    public double getPercentageSpent() {
        return getTotalActualAmount() / getTotalBudgetedAmount();
    }

    // Get the percentage of the budget that is remaining
    public double getPercentageRemaining() {
        return getTotalRemainingAmount() / getTotalBudgetedAmount();
    }
}

