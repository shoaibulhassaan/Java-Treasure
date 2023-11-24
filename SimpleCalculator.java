import java.util.Scanner;

/*
 * @author Shoaib ul hassan
 * @email Shoaibulhassaan@gmail.com
 * @version 1.0
 * @since 2023-11-25
*/


public class SimpleCalculator {
  
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero. :( ");
                }
                break;
            
            default:
                System.out.println("Error: Invalid operator please enter correct one.");
        }

        scanner.close();
    }
}
