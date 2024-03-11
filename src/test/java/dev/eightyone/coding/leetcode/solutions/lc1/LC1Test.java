package dev.eightyone.coding.leetcode.solutions.lc1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LC1Test {

    LC1 sut;

    @BeforeEach
    void setUp() {
        sut = new LC1();
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void twoSum(int[] nums, int target, int[] result) {
        int[] actual = sut.twoSum(nums, target);
        assertThat(actual).isEqualTo(result);
    }

    private static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1})
        );
    }
}