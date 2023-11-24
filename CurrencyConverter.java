import java.util.Scanner;

/*
 * @author Shoaib ul hassan
 * @email Shoaibulhassaan@gmail.com
 * @version 1.0
 * @since 2023-11-25
*/


public class CurrencyConverter {
  
    public static void main(String[] args) {
      
        // Exchange rates today
        double usdToEurRate = 0.91;
        double usdToGbpRate = 0.79;
        double usdToPkrRate = 285.75;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1. USD to EUR");
        System.out.println("2. USD to GBP");
        System.out.println("3. USD to PKR");
        System.out.print("Please Enter choice (1-3): ");

        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= 3) {
            System.out.print("Enter amount in USD: ");
            double usdAmount = scanner.nextDouble();

            double convertedAmount;
            // check choice enetered by user between 1-3 you can add more in the same manner
            switch (choice) {
                case 1:
                    convertedAmount = usdAmount * usdToEurRate;
                    System.out.printf("%.2f USD is equal to %.2f EUR%n", usdAmount, convertedAmount);
                    break;
                case 2:
                    convertedAmount = usdAmount * usdToGbpRate;
                    System.out.printf("%.2f USD is equal to %.2f GBP%n", usdAmount, convertedAmount);
                    break;
                case 3:
                    convertedAmount = usdAmount * usdToPkrRate;
                    System.out.printf("%.2f USD is equal to %.2f PKR%n", usdAmount, convertedAmount);
                    break;
            }
        } else {
          
            System.out.println("Invalid choice. Please select a number between 1 and 3.");
          
        }
      
        scanner.close();
    }
}
