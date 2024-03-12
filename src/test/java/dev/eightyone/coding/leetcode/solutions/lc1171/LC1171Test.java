package dev.eightyone.coding.leetcode.solutions.lc1171;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LC1171Test {

    LC1171 sut;

    @BeforeEach
    void setUp() {
        sut = new LC1171();
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void removeZeroSumSublists(LC1171.ListNode head, LC1171.ListNode expected) {
        LC1171.ListNode actual = sut.removeZeroSumSublists(head);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        LC1171.ListNode.fromArray(1, 2, -3, 3, 1),
                        LC1171.ListNode.fromArray(3, 1)
                ),
                Arguments.of(
                        LC1171.ListNode.fromArray(1, 2, 3, -3, 4),
                        LC1171.ListNode.fromArray(1, 2, 4)
                ),
                Arguments.of(
                        LC1171.ListNode.fromArray(1, 2, 3, -3, -2),
                        LC1171.ListNode.fromArray(1)
                ),
                Arguments.of(
                        LC1171.ListNode.fromArray(1, 2, 3, -3, -2, 5),
                        LC1171.ListNode.fromArray(1, 5)
                ),
                Arguments.of(
                        LC1171.ListNode.fromArray(1, 2, 3, -3, -2, 5, -5, 1),
                        LC1171.ListNode.fromArray(1, 1)
                ),
                Arguments.of(
                        LC1171.ListNode.fromArray(1, 3, 2, -3, -2, 5, 5, -5, 1),
                        LC1171.ListNode.fromArray(1, 5, 1)
                )
        );
    }
}