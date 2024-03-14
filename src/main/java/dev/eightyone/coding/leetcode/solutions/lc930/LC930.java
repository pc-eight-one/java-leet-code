package dev.eightyone.coding.leetcode.solutions.lc930;

import dev.eightyone.coding.leetcode.core.ProblemUrl;

import java.util.HashMap;
import java.util.Map;

@ProblemUrl(url = "https://leetcode.com/problems/binary-subarrays-with-sum")
public class LC930 {

    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);
        int sum = 0;
        int result = 0;
        for (int num : nums) {
            sum += num;
            result += counts.getOrDefault(sum - goal, 0);
            counts.put(sum, counts.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}
