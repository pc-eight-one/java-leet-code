package dev.eightyone.coding.leetcode.solutions.lc1;

import dev.eightyone.coding.leetcode.core.ProblemUrl;

import java.util.HashMap;
import java.util.Map;

@ProblemUrl(url = "https://leetcode.com/problems/two-sum/")
public class LC1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int diff = target - nums[i];
            if (m.get(diff) != null) return new int[] {m.get(diff), i};
            m.put(nums[i], i);
        }
        return new int[] {};
    }
}
