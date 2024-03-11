package dev.eightyone.coding.leetcode.solutions.lc2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LC2Test {

    LC2 sut;

    @BeforeEach
    void setUp() {
        sut = new LC2();
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void addTwoNumbers(ListNode l1, ListNode l2, ListNode result) {
        var actual = sut.addTwoNumbers(l1, l2);
        assertThat(actual).isEqualTo(result);
    }

    private static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        ListNode.fromArray(2, 4, 3),
                        ListNode.fromArray(5, 6, 4),
                        ListNode.fromArray(7, 0, 8)
                ),
                Arguments.of(
                        ListNode.fromArray(0),
                        ListNode.fromArray(0),
                        ListNode.fromArray(0)
                ),
                Arguments.of(
                        ListNode.fromArray(9, 9, 9, 9, 9, 9, 9),
                        ListNode.fromArray(9, 9, 9, 9),
                        ListNode.fromArray(8, 9, 9, 9, 0, 0, 0, 1)
                )
        );
    }
}