package dev.eightyone.coding.leetcode.solutions.lc3;

import dev.eightyone.coding.leetcode.core.ProblemUrl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@ProblemUrl(url = "https://leetcode.com/problems/longest-substring-without-repeating-characters/")
public class LC3 {

    /**
     * This is an interesting problem. The solution is not straightforward. We need a couple of things to solve this
     * problem. We can track the duplicate characters in a Set. We can also track the current longest substring length
     * in a variable called largestSubstring and the current substring length in a variable called currentSubstring.
     * Let us see how this goes.
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstringSolutionOne(String s) {
        Set<Character> foundCharactersSet = new HashSet<>();
        int largestSubstring = 0;
        int currentSubstring = 0;
        int currentIdx = 0;

        while (currentIdx != s.length()) {
            if (!foundCharactersSet.contains(s.charAt(currentIdx))) {
                foundCharactersSet.add(s.charAt(currentIdx));
                currentSubstring++;
                largestSubstring = Math.max(largestSubstring, currentSubstring);
                currentIdx++;
            } else {
                foundCharactersSet.remove(s.charAt(currentIdx - currentSubstring));
                currentSubstring--;
            }
        }
        return largestSubstring;
    }

    /**
     * This was somehow faster than the previous solution.
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstringSolutionTwo(String s) {
        Map<Character, Integer> foundCharactersMap = new HashMap<>();
        int largestSubstring = 0;
        for (int j = 0, i = 0; j < s.length(); j++) {
            if (foundCharactersMap.containsKey(s.charAt(j))) {
                i = Math.max(foundCharactersMap.get(s.charAt(j)), i);
            }
            largestSubstring = Math.max(largestSubstring, j - i + 1);
            foundCharactersMap.put(s.charAt(j), j + 1);
        }
        return largestSubstring;
    }
}
