package dev.eightyone.coding.leetcode.solutions.lc1;

import dev.eightyone.coding.leetcode.core.ProblemUrl;

import java.util.HashMap;
import java.util.Map;

@ProblemUrl(url = "https://leetcode.com/problems/two-sum/")
public class LC1 {

    /**
     * Finds two numbers in the given array that add up to the target value using a HashMap.
     * The algorithm iterates over the array exactly once, hence it has a time complexity of O(n).
     * Since we may in the worst case store each element in the HashMap, the space complexity is also O(n).
     *
     * @param nums   the array of integers
     * @param target the target value to find
     * @return an array containing the indices of the two numbers that add up to the target value,
     * returns an empty array if no such numbers exist
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int diff = target - nums[i];
            if (m.get(diff) != null) return new int[]{m.get(diff), i};
            m.put(nums[i], i);
        }
        return new int[]{};
    }
}