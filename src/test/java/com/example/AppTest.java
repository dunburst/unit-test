package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testIsPrime_SimpleCases() {
        assertTrue(MathUtils.isPrime(2), "2 should be prime");
        assertTrue(MathUtils.isPrime(3), "3 should be prime");
        assertFalse(MathUtils.isPrime(4), "4 should not be prime");
        assertTrue(MathUtils.isPrime(5), "5 should be prime");
        assertTrue(MathUtils.isPrime(13), "13 should be prime");
        assertFalse(MathUtils.isPrime(9), "9 should not be prime");
    }

    @Test
    void testIsPrime_BoundaryCases() {
        assertFalse(MathUtils.isPrime(0), "0 should not be prime");
        assertFalse(MathUtils.isPrime(1), "1 should not be prime");
        // Kiểm tra đầu vào âm
        assertThrows(IllegalArgumentException.class, () -> MathUtils.isPrime(-1), "Input must be non-negative");
        assertThrows(IllegalArgumentException.class, () -> MathUtils.isPrime(-10), "Input must be non-negative");
    }

    @Test
    void testIsPrime_LargeNumbers() {
        assertTrue(MathUtils.isPrime(97), "97 should be prime");
        assertFalse(MathUtils.isPrime(100), "100 should not be prime");
        assertTrue(MathUtils.isPrime(104729), "104729 should be prime");
    }

    @Test
    void testIsPrime_EvenNumbers() {
        assertFalse(MathUtils.isPrime(1000000), "1000000 should not be prime");
        assertFalse(MathUtils.isPrime(999998), "999998 should not be prime");
    }

    @Test
    void testIsPrime_PerformanceTest() {
        long startTime = System.currentTimeMillis();
        assertFalse(MathUtils.isPrime(1_000_000), "1000000 should not be prime");
        assertTrue(MathUtils.isPrime(999_983), "999983 should be prime");
        long endTime = System.currentTimeMillis();
        assertTrue(endTime - startTime < 1000, "Performance test failed"); // Tăng lên 1000ms nếu cần
    }

    @Test
    void testIsPrime_NegativeNumber() {
        // Kiểm tra ngoại lệ cho số âm
        assertThrows(IllegalArgumentException.class, () -> MathUtils.isPrime(-1), "Input must be non-negative");
    }
}
