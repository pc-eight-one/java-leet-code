package dev.eightyone.coding.leetcode.solutions.lc11;

import dev.eightyone.coding.leetcode.core.ProblemUrl;

import java.util.stream.IntStream;

@ProblemUrl(url = "https://leetcode.com/problems/container-with-most-water/")
public class LC11 {

//    public int maxArea(int[] height) {
//        int pLeft = 0;
//        int pRight = height.length - 1;
//        int currentMaxWater = 0;
//
//        while (pLeft < pRight) {
//            int diff = Math.abs(pLeft - pRight);
//            int h = Math.min(height[pLeft], height[pRight]);
//            int waterVol = diff * h;
//
//            currentMaxWater = Math.max(currentMaxWater, waterVol);
//
//            if (height[pLeft] > height[pRight]) {
//                pRight--;
//            } else {
//                pLeft++;
//            }
//
//        }
//        return currentMaxWater;
//    }

    public int maxArea(int[] height) {
        return IntStream.range(0, height.length)
                .boxed()
                .flatMap(i -> IntStream.range(i + 1, height.length)
                        .mapToObj(j -> new int[]{i, j}))
                .mapToInt(pair -> {
                    int pLeft = pair[0];
                    int pRight = pair[1];
                    int h = Math.min(height[pLeft], height[pRight]);
                    return (pRight - pLeft) * h;
                })
                .max()
                .orElse(0);
    }
}
