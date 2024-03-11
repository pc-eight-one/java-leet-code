package dev.eightyone.coding.leetcode.solutions.lc2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ListNodeTest {

    @Test
    void fromArray() {

        ListNode result = ListNode.fromArray(1, 2, 3);
        assertThat(result).isNotNull();

        assertThat(result.val).isEqualTo(1);

        assertThat(result.next).isNotNull();
        assertThat(result.next.val).isEqualTo(2);

        assertThat(result.next.next).isNotNull();
        assertThat(result.next.next.val).isEqualTo(3);
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void equals(ListNode listNode1, ListNode listNode2, boolean expected) {
        boolean result = listNode1.equals(listNode2);
        assertThat(result).isEqualTo(expected);
    }

    private static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(ListNode.fromArray(1, 2, 3), ListNode.fromArray(1, 2, 3), true),
                Arguments.of(ListNode.fromArray(1, 2, 3), ListNode.fromArray(1, 2, 4), false),
                Arguments.of(ListNode.fromArray(1, 2, 3), ListNode.fromArray(1, 2), false),
                Arguments.of(ListNode.fromArray(1, 2, 3), ListNode.fromArray(1, 2, 3, 4), false)
        );
    }
}