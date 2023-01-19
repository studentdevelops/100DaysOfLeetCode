# Day 64 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an array of positive integers `nums`, return the maximum possible sum of an ascending subarray in `nums`.

A subarray is defined as a contiguous sequence of numbers in an array.

A subarray `[nums l, nums l+1, ..., nums r-1, nums r]` is ascending if for all `i` where `l <= i < r`, n`umsi  < numsi+1`. Note that a subarray of size `1` is ascending.
 


#### LeetCode Link: [Maximum Ascending Subarray Sum](https://leetcode.com/problems/maximum-ascending-subarray-sum/description/)
___


### Test Cases
```
Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
```
```
Input: nums = [10,20,30,40,50]
Output: 150
Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.
```
```
Input: nums = [12,17,15,13,10,11,12]
Output: 33
Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.
```
___

### Constraints 
* `1 <= nums.length <= 100`
* `1 <= nums[i] <= 100`

```java
class Solution {
    public int maxAscendingSum(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int last_digit = nums[0];
        int sum = nums[0], last_sum = 0;
        for (int i = 1; i < nums.length; i++) {
            if (last_digit == nums[i]) {
                last_digit = nums[i];
                if(sum > last_sum){
                    last_sum = sum;
                }
                sum = nums[i];
                continue;
            }
            if (nums[i] >= last_digit) {
                sum = sum + nums[i];
                last_digit = nums[i];
            }

            if (nums[i] < last_digit) {
                last_digit = nums[i];
                if (sum > last_sum) {
                    last_sum = sum;
                }
                sum = nums[i];
            }
        }
        if (last_sum < sum)
            return sum;
        return last_sum;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/213551038-db58ef1a-f864-4795-811c-dc6663330f23.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/67c37534ff480608b07fffbe2023a0f5ce6b245e/Day64_Maximum_Ascending_Subarray_Sum/code.java)
