import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        // Prime check logic
        if (number <= 1) {
            isPrime = false; // 0, 1, and negative numbers are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is NOT a Prime number.");
        }

        scanner.close();
    }
}
