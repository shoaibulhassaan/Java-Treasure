package com.shoaibulhassan.ShoppingCartApp;

import java.util.Scanner;


public class ShoppingCartApp {
	
    public static void main(String[] args) {
    	
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
        	
            System.out.println("\nShopping Cart Operations:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Cart");
            System.out.println("4. Calculate Total");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.next();
                    System.out.print("Enter item price: ");
                    double itemPrice = scanner.nextDouble();
                    Item newItem = new Item(itemName, itemPrice);
                    cart.addItem(newItem);
                    break;
                case 2:
                    System.out.print("Enter the index of the item to remove: ");
                    int indexToRemove = scanner.nextInt() - 1;
                    cart.removeItem(indexToRemove);
                    break;
                case 3:
                    cart.viewCart();
                    break;
                case 4:
                    System.out.println("Total cost of items in the cart: $" + cart.calculateTotal());
                    break;
                case 5:
                    System.out.println("Exiting the program. Thank you!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
            
        }
        
    }
    
}
