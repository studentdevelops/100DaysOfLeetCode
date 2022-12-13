# Day 38 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an integer array `nums` of length `n`, you want to create an array `ans` of length `2n` where `ans[i] == nums[i]` and `ans[i + n] == nums[i]` for `0 <= i < n` (0-indexed).

Specifically, `ans` is the concatenation of two `nums` arrays.

Return the array `ans`.


#### LeetCode Link: [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/description/)
___


### Test Cases
```
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
```
```
Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
```
___

### Constraints 
* `n == nums.length`
* `1 <= n <= 1000`
* `1 <= nums[i] <= 1000`

___
```java
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] numsNew = new int[2* nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsNew[i] = nums[i];
            numsNew[i+nums.length] = nums[i];
        }
        return numsNew;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/207427022-dcc718f7-6d44-41fa-9366-3dd12684e6ff.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/e517ab6b5653d86add2b017cf9d425ec7a20ffa0/Day38_Concatening_Array/code.java)
