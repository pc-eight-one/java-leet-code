package dev.eightyone.coding.leetcode.solutions.lc930;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LC930Test {

    LC930 sut;

    @BeforeEach
    void setUp() {
        sut = new LC930();
    }

    @ParameterizedTest
    @MethodSource("dev.eightyone.coding.leetcode.solutions.lc930.LC930Test#numSubarraysWithSumTestCases")
    void numSubarraysWithSum(int[] nums, int goal, int result) {
        assertEquals(result, sut.numSubarraysWithSum(nums, goal));
    }

    private static Stream<Arguments> numSubarraysWithSumTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 0, 1, 0, 1}, 2, 4),
                Arguments.of(new int[]{0, 0, 0, 0, 0}, 0, 15)
        );
    }
}