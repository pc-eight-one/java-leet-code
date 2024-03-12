package dev.eightyone.coding.leetcode.solutions.lc9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LC9Test {

    LC9 sut;

    @BeforeEach
    void setUp() {
        sut = new LC9();
    }

    @ParameterizedTest
    @MethodSource("dev.eightyone.coding.leetcode.solutions.lc9.LC9Test#provideIsPalindromeTestData")
    void isPalindrome(int x, boolean result) {
        assertEquals(result, sut.isPalindrome(x));
    }

    static Object[][] provideIsPalindromeTestData() {
        return new Object[][]{
                {121, true},
                {-121, false},
                {10, false},
                {-101, false},
                {0, true}
        };
    }
}