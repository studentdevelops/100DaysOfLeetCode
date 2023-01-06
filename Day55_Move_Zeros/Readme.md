# Day 55 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.


#### LeetCode Link: [Move Zeroes](https://leetcode.com/problems/move-zeroes/description/)
___


### Test Cases
```
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
```
```
Input: nums = [0]
Output: [0]
```
___

### Constraints 
* `1 <= nums.length <= 10^4`
* `--2^31 <= nums[i] <= 2^31 - 1`

___
```java
class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1 || nums.length == 0) {
            return;
        }
        int swaped = 0;
        for (int i = 0; i < nums.length - swaped; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                    
                }
                nums[nums.length - 1] = 0;
                swaped++;
                if(nums[i] == 0 ){
                    i--;
                }
            }
        }
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/211107170-1ba41cce-9aad-4b41-bfa8-3e82f45cfa42.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/de367dd117c1cb9052fb62be258d9a8a0a94a7d9/Day55_Move_Zeros/code.java)
