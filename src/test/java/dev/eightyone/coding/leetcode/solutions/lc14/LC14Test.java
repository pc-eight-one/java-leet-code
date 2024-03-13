package dev.eightyone.coding.leetcode.solutions.lc14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LC14Test {

    LC14 sut;

    @BeforeEach
    void setUp() {
        sut = new LC14();
    }

    @ParameterizedTest
    @MethodSource("dev.eightyone.coding.leetcode.solutions.lc14.LC14Test#longestCommonPrefixTestCases")
    void longestCommonPrefix(String[] s, String result) {
        assertEquals(result, sut.longestCommonPrefix(s));
    }

    private static Stream<Arguments> longestCommonPrefixTestCases() {
        return Stream.of(
                Arguments.of(new String[]{"flower", "flow", "flight"}, "fl"),
                Arguments.of(new String[]{"dog", "racecar", "car"}, ""),
                Arguments.of(new String[]{"", "b"}, ""),
                Arguments.of(new String[]{"a"}, "a"),
                Arguments.of(new String[]{"a", "a"}, "a")
        );
    }
}