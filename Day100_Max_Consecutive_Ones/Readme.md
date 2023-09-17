# Day 100 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a binary array `nums`, return the maximum number of consecutive `1`'s in the array.


#### LeetCode Link: [Max Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones/description/)
___


### Test Cases
```
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
```
```
Input: nums = [1,0,1,1,0,1]
Output: 2
```
___

### Constraints 
* `1 <= nums.length <= 10^5`
* `nums[i]` is either `0` or `1`.

```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int highestCount = -1;
        int curCount = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if(flag && nums[i] == 1){
                if(nums[i] == 1){
                    curCount++;
                }
            }
            else if(nums[i] == 1){
                flag = true;
                curCount++;
            } else {
                curCount = 0;
                flag = false;
            }

            if(curCount > highestCount){
                highestCount = curCount;
            }
        }
        return highestCount;
    }
}
```
___
### Results
![image](https://github.com/studentdevelops/100DaysOfLeetCode/assets/31382363/863dbb54-ad1f-4bea-abe1-a4f7c8b3e91b)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/aee36581f6b9d13f73653495c36d1c870108ce5b/Day99_Ugly_Number/code.java)
