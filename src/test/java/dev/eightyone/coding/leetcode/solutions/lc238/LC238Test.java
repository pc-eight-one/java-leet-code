package dev.eightyone.coding.leetcode.solutions.lc238;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LC238Test {

    LC238 sut;

    @BeforeEach
    void setUp() {
        sut = new LC238();
    }

    @ParameterizedTest
    @MethodSource("dev.eightyone.coding.leetcode.solutions.lc238.LC238Test#productExceptSelfTestCases")
    void productExceptSelf(int[] nums, int[] result) {
        assertArrayEquals(result, sut.productExceptSelf(nums));
    }

    private static Stream<Arguments> productExceptSelfTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{24, 12, 8, 6}),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{120, 60, 40, 30, 24}),
                Arguments.of(new int[]{-1, 1, 0, -3, 3}, new int[]{0, 0, 9, 0, 0})
        );
    }
}