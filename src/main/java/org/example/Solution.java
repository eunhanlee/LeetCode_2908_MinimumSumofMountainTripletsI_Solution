package org.example;

class Solution {
    public int minimumSum(int[] nums) {
        int len = nums.length;
        int result=Integer.MAX_VALUE;

        for(int i = 0; i<len;i++){
            for(int j = i;j<len;j++){
                if(nums[i]<nums[j]){
                    for(int k = j;k<len;k++){
                        if(nums[k]<nums[j]){
                            int tempSum = nums[i]+nums[j]+nums[k];
                            result=Math.min(tempSum, result);

                        }
                    }
                }

            }
        }

        if(result ==Integer.MAX_VALUE) return -1;
        return result;

    }
}