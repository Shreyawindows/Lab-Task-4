import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        long factorial = 1; // Use long to handle big results

        // Calculate factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Output result
        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}