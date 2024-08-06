package dev.eightyone.coding.leetcode.solutions.lc11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LC11Test {

    LC11 sut;

    @BeforeEach
    void setUp() {
        sut = new LC11();
    }

    @ParameterizedTest
    @MethodSource("provideMaxAreaTestData")
    void maxArea(int[] heights, int expected) {
        assertThat(sut.maxArea(heights)).isEqualTo(expected);
    }

    private static Stream<Arguments> provideMaxAreaTestData() {
        return Stream.of(
                Arguments.of(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                Arguments.of(new int[]{1, 1}, 1),
                Arguments.of(new int[]{4, 3, 2, 1, 4}, 16),
                Arguments.of(new int[]{1, 2, 1}, 2)
        );
    }
}