package dev.eightyone.coding.leetcode.solutions.lc13;

import dev.eightyone.coding.leetcode.core.ProblemUrl;

import java.util.Map;

@ProblemUrl(url = "https://leetcode.com/problems/roman-to-integer/")
public class LC13 {

    public int romanToInt(String s) {
        Map<Character, Integer> registry = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int total = 0;
        int lastValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = registry.get(s.charAt(i));
            total = currentValue < lastValue ? total - currentValue : total + currentValue;
            lastValue = currentValue;
        }

        return total;
    }
}
