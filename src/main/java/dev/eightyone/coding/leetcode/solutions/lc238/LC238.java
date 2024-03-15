package dev.eightyone.coding.leetcode.solutions.lc238;

import dev.eightyone.coding.leetcode.core.ProblemUrl;

@ProblemUrl(url = "https://leetcode.com/problems/product-of-array-except-self")
public class LC238 {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;

        int[] answer = new int[length];

        answer[0] = 1;

        for (int i = 1; i < length; i++) {
            answer[i] = nums[i - 1] * answer[i - 1];
        }

        int right = 1;
        for (int i = length - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right *= nums[i];
        }

        return answer;
    }
}
