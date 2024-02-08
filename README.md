## Problem

[Link to the problem](https://leetcode.com/problems/minimum-sum-of-mountain-triplets-i/description/)

### Problem Solving Approach

1. One of the conditions is that i < j < k, so to satisfy this, we use three for loops.
2. Start with i at 0, j at i, and k at j.
3. Then add an if statement to only iterate the k loop when nums[i] < nums[j], and proceed to the next condition when nums[k] < nums[j].
4. The next condition is to keep only the smallest sum when adding three values.
5. To do this, initialize a new variable (result) outside the loop with the maximum value of int, and update it when a smaller value is found.
6. When all loops are finished, if the variable remains the maximum value of int, it means there are no three numbers satisfying the condition, so return -1.