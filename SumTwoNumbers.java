import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Create Scanner object
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt(); // Take first number
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt(); // Take second number
        
        int sum = num1 + num2; // Calculate sum
        
        System.out.println("The sum is: " + sum); // Print sum
        
        sc.close(); // Close scanner
    }
}