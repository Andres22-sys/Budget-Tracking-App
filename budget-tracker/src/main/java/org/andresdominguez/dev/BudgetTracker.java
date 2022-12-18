package org.andresdominguez.dev;

import org.andresdominguez.dev.classes.Budget;
import org.andresdominguez.dev.classes.BudgetCategory;

import java.util.Scanner;


public class BudgetTracker {
    // Define the main class for the budget tracker program
    public static void main(String[] args) {
        // Create a new budget object
        Budget budget = new Budget();

        // Display the main menu and handle user input
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) {
            System.out.println("Budget Tracker");
            System.out.println("==============");
            System.out.println("1. Add a new budget category");
            System.out.println("2. Add a new transaction");
            System.out.println("3. Remove a transaction");
            System.out.println("4. Edit a transaction");
            System.out.println("5. View budget report");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (choice) {
                case 1:
                    // Add a new budget category
                    System.out.print("Enter the name of the budget category: ");
                    String categoryName = scanner.nextLine();
                    System.out.print("Enter the budgeted amount for the budget category: ");
                    double budgetedAmount = scanner.nextDouble();
                    scanner.nextLine();
                    BudgetCategory category = new BudgetCategory(categoryName, budgetedAmount);
                    budget.addCategory(category);
                    System.out.println();
                    break;
                case 2:
                    // Add a new transaction
                    System.out.print("Enter the name of the budget category: ");
                    categoryName = scanner.nextLine();
                    System.out.print("Enter the amount of the transaction: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    budget.addTransaction(categoryName, amount);
                    System.out.println();
                    break;
                case 3:
                    // Remove a transaction
                    System.out.print("Enter the name of the budget category: ");
                    categoryName = scanner.nextLine();
                    System.out.print("Enter the amount of the transaction: ");
                    amount = scanner.nextDouble();
                    scanner.nextLine();
                    budget.removeTransaction(categoryName, amount);
                    System.out.println();
                    break;
                case 4:
                    // Edit a transaction
                    System.out.print("Enter the name of the budget category: ");
                    categoryName = scanner.nextLine();
                    System.out.print("Enter the old amount of the transaction: ");
                    double oldAmount = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter the new amount of the transaction: ");
                    double newAmount = scanner.nextDouble();
                    scanner.nextLine();
                    budget.editTransaction(categoryName, oldAmount, newAmount);
                    System.out.println();
                    break;
                case 5:
                    // View the budget report
                    System.out.println("Budget Report");
                    System.out.println("=============");
                    for (BudgetCategory c : budget.getCategories()) {
                        System.out.printf("%s: $%.2f of $%.2f%n", c.getName(), c.getActualAmount(), c.getBudgetedAmount());
                    }
                    System.out.println();
                    break;
                case 6:
                    // Exit the program
                    System.out.println("Goodbye!");
                    break;
                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println();
                    break;
            }
        }
    }
}