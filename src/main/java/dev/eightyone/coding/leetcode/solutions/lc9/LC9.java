package dev.eightyone.coding.leetcode.solutions.lc9;

import dev.eightyone.coding.leetcode.core.ProblemUrl;

@ProblemUrl(url = "https://leetcode.com/problems/palindrome-number/")
public class LC9 {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reversed = 0, original = x;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return original == reversed;
    }
}
