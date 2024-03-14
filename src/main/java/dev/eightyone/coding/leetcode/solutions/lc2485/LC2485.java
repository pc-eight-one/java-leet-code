package dev.eightyone.coding.leetcode.solutions.lc2485;

import dev.eightyone.coding.leetcode.core.ProblemUrl;
import dev.eightyone.coding.leetcode.core.RevisitSolution;

import java.util.stream.IntStream;

@ProblemUrl(url = "https://leetcode.com/problems/find-the-pivot-integer/")
public class LC2485 {

    @RevisitSolution("This solution looks like it needs improvement")
    public int pivotInteger(int n) {
        int[] sumsForward = new int[n];
        int sumForward = 0;
        for (int i = 0; i < n; i++) {
            sumsForward[i] = sumForward + i + 1;
            sumForward = sumsForward[i];
        }

        int[] sumsBackward = new int[n];
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sumsBackward[i] = sum + i + 1;
            sum = sumsBackward[i];
        }

        for (int i = 0; i < n; i++) {
            if (sumsForward[i] == sumsBackward[i]) {
                return i + 1;
            }
        }

        return -1;
//        int sumForward = 0;
//        int sumBackward = 0;
//        for (int i = 0; i < n; i++) {
//            sumForward += i + 1;
//            sumBackward += n - (i + 1);
//            if (sumForward == sumBackward) {
//                return i + 1;
//            }
//        }
//        return -1;
    }
}
