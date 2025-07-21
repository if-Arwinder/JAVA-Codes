import java.util.Scanner;

public class Prime {

    // Check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Check if a single number is prime
    static void Prime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number = ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    // Program to Print prime numbers between n and m
    static void PrimeSeries() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first term = ");
        int n = sc.nextInt();
        System.out.print("Enter the last term = ");
        int m = sc.nextInt();

        System.out.println("Prime Numbers between " + n + " and " + m + " are:");
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    
}