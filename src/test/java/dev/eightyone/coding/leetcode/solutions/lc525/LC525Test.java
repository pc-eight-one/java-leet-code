package dev.eightyone.coding.leetcode.solutions.lc525;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LC525Test {

    LC525 sut;

    @BeforeEach
    void setUp() {
        sut = new LC525();
    }

    @ParameterizedTest
    @MethodSource("dev.eightyone.coding.leetcode.solutions.lc525.LC525Test#findMaxLengthTestCases")
    void findMaxLength(int[] arr, int result) {
        assertEquals(result, sut.findMaxLength(arr));
    }

    private static Stream<Arguments> findMaxLengthTestCases() {
        return Stream.of(
                Arguments.of(new int[]{0, 1}, 2),
                Arguments.of(new int[]{0, 1, 0}, 2),
                Arguments.of(new int[]{0, 1, 0, 1, 0, 1, 1, 0}, 8),
                Arguments.of(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0}, 12),
                Arguments.of(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1}, 12)
        );
    }
}