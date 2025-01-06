package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    @Test
    void testIsPrime_NormalCases() {
        assertTrue(MathUtils.isPrime(2));
        assertTrue(MathUtils.isPrime(3));
        assertFalse(MathUtils.isPrime(4));
    }

    @Test
    void testIsPrime_BoundaryCases() {
        assertFalse(MathUtils.isPrime(1));
        assertFalse(MathUtils.isPrime(0));
        assertFalse(MathUtils.isPrime(-1));
    }

    @Test
    void testIsPrime_LargeNumber() {
        assertTrue(MathUtils.isPrime(97));
        assertFalse(MathUtils.isPrime(100));
    }
}
