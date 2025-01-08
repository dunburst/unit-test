package com.example;

/**
 * Utility class for mathematical operations.
 */
public class MathUtils {

    /**
     * Checks if a number is a prime number.
     *
     * @param n the number to check (must be non-negative).
     * @return true if n is a prime number, false otherwise.
     * @throws IllegalArgumentException if n is negative.
     */
    public static boolean isPrime(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        
        if (n < 2) { // 0 and 1 are not prime numbers
            return false;
        }
        
        if (n == 2) { // 2 is the smallest prime number
            return true;
        }
        
        if (n % 2 == 0) { // Exclude even numbers greater than 2
            return false;
        }

        // Check divisors from 3 to √n, skipping even numbers
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
