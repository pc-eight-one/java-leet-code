package dev.eightyone.coding.leetcode.solutions.lc2485;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LC2485Test {

    LC2485 sut;

    @BeforeEach
    void setUp() {
        sut = new LC2485();
    }

    @ParameterizedTest
    @MethodSource("dev.eightyone.coding.leetcode.solutions.lc2485.LC2485Test#pivotIntegerTestCases")
    void pivotInteger(int n, int result) {
        assertEquals(result, sut.pivotInteger(n));
    }

    private static Stream<Arguments> pivotIntegerTestCases() {
        return Stream.of(
                Arguments.of(8, 6),
                Arguments.of(1, 1),
                Arguments.of(4, -1)
        );
    }
}