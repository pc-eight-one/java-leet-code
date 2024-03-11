package dev.eightyone.coding.leetcode.solutions.lc3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LC3Test {

    LC3 sut;

    @BeforeEach
    void setUp() {
        sut = new LC3();
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void lengthOfLongestSubstring(String s, int result) {
        assertThat(sut.lengthOfLongestSubstringSolutionOne(s)).isEqualTo(result);
        assertThat(sut.lengthOfLongestSubstringSolutionTwo(s)).isEqualTo(result);
    }

    private static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbb", 1),
                Arguments.of("pwwkew", 3),
                Arguments.of("", 0),
                Arguments.of(" ", 1),
                Arguments.of("au", 2),
                Arguments.of("dvdf", 3),
                Arguments.of("abba", 2)
        );
    }
}