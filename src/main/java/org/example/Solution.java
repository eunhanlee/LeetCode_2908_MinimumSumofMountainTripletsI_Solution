package org.example;

/**
 * packageName    : org.example
 * fileName       : Solution
 * author         : Eunhan Lee
 * date           : 2024-02-08
 * description    : leetcode 2908. Minimum Sum of Mountain Triplets I java solution
 * ===========================================================
 * DATE | AUTHOR | NOTE
 * -----------------------------------------------------------
 * 2024-02-08 | Eunhan Lee | initial creation
 */
class Solution {
    /**
     * Finds the three numbers from int array.
     * i < j < k
     * nums[i] < nums[j] and nums[k] < nums[j]
     * If no such triplet exists, returns -1.
     *
     * @param nums int array
     * @return the minimum possible sum of a mountain triplet of nums. If no such triplet exists, return -1.
     */
    public int minimumSum(int[] nums) {
        int len = nums.length;
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (nums[i] < nums[j]) {
                    for (int k = j; k < len; k++) {
                        if (nums[k] < nums[j]) {
//                            at this moment, all condition fulfilled, i < j < k,  nums[i] < nums[j] and nums[k] < nums[j]
                            int tempSum = nums[i] + nums[j] + nums[k];
                            result = Math.min(tempSum, result);

                        }
                    }
                }

            }
        }

        if (result == Integer.MAX_VALUE) return -1;
        return result;

    }
}
