# Day 37 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an array `nums`. We define a running sum of an array as `runningSum[i] = sum(nums[0]…nums[i])`.

Return the running sum of `nums`.


#### LeetCode Link: [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/description/)
___


### Test Cases
```
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
```
```
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
```
```
Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
```
___

### Constraints 
* `1 <= nums.length <= 1000`
* `-10^6 <= nums[i] <= 10^6`

___
```java
class Solution {
    public int[] runningSum(int[] nums) {
        int[] newNums = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            newNums[i] = sum;
        }
        return newNums;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/207141939-05dd0b29-fbeb-4bfc-a703-0cdbc54da7cf.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/e20a20adb373c76fdcbf081eda64ce1f6d9b5deb/Day37_Running_Sum_Of_1D_Array/code.java)
