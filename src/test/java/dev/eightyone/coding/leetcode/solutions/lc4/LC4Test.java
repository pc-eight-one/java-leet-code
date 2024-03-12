package dev.eightyone.coding.leetcode.solutions.lc4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LC4Test {

    LC4 sut;

    @BeforeEach
    void setUp() {
        sut = new LC4();
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void findMedianSortedArrays(int[] a1, int[] a2, double expected) {
        assertEquals(expected, sut.findMedianSortedArrays(a1, a2));
    }

    private static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 3}, new int[]{2}, 2.0),
                Arguments.of(new int[]{1, 2}, new int[]{3, 4}, 2.5),
                Arguments.of(new int[]{0, 0}, new int[]{0, 0}, 0.0),
                Arguments.of(new int[]{}, new int[]{1}, 1.0),
                Arguments.of(new int[]{2}, new int[]{}, 2.0)
        );
    }
}