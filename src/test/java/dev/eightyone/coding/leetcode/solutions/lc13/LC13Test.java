package dev.eightyone.coding.leetcode.solutions.lc13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LC13Test {

    LC13 sut;

    @BeforeEach
    void setUp() {
        sut = new LC13();
    }

    @ParameterizedTest
    @MethodSource("dev.eightyone.coding.leetcode.solutions.lc13.LC13Test#romanToIntProvider")
    void romanToInt(String roman, int result) {
        assertEquals(result, sut.romanToInt(roman));
    }

    static Object[][] romanToIntProvider() {
        return new Object[][]{
                {"III", 3},
                {"IV", 4},
                {"IX", 9},
                {"LVIII", 58},
                {"MCMXCIV", 1994}
        };
    }
}