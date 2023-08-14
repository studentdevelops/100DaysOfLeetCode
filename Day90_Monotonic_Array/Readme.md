# Day 90 of `#100DaysOfLeetCode`

___
### Problem Statement:  
An array is **monotonic** if it is either monotone increasing or monotone decreasing.

An array `nums` is monotone increasing if for all `i <= j`, `nums[i] <= nums[j]`. An array nums is monotone decreasing if for all `i <= j`, `nums[i] >= nums[j]`.

Given an integer array `nums`, return `true` if the given array is monotonic, or `false` otherwise.

#### LeetCode Link: [Monotonic Array](https://leetcode.com/problems/monotonic-array/description/?envType=study-plan-v2&envId=programming-skills)
___


### Test Cases
```
Input: nums = [1,2,2,3]
Output: true
```
```
Input: nums = [6,5,4,4]
Output: true
```
```
Input: nums = [1,3,2]
Output: false
```
___

### Constraints 
* `1 <= nums.length <= 10^5`
* `-10^5 <= nums[i] <= 10^5`
___

```java
class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        boolean flag = false;
        if (nums[0] <= nums[1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if ((nums[i] <= nums[i + 1])) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            return flag;
        }
        if (nums[0] >= nums[1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if ((nums[i] >= nums[i + 1])) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
```
___
### Results
![image](https://github.com/studentdevelops/100DaysOfLeetCode/assets/31382363/30a33f8a-7ed8-49a5-9cb5-f62a90e3b6ff)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/a54caedef6aa79e9cfffba6f9841cfc8e67af46d/Day90_Monotonic_Array/code.java)
