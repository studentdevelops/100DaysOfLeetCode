# Day 10 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You are given an array of integers `nums`. You are also given an integer `original` which is the first number that needs to be searched for in `nums`.

You then do the following steps:

If `original` is found in `nums`, multiply it by two (i.e., set `original = 2 * original`).
Otherwise, stop the process.
Repeat this process with the new number as long as you keep finding the number.
Return the final value of `original`.

#### LeetCode Link: [Keep Multiplying Found Values by Two](https://leetcode.com/problems/keep-multiplying-found-values-by-two/description/)
___


### Test Cases
```
Input: nums = [5,3,6,1,12], original = 3
Output: 24
Explanation: 
- 3 is found in nums. 3 is multiplied by 2 to obtain 6.
- 6 is found in nums. 6 is multiplied by 2 to obtain 12.
- 12 is found in nums. 12 is multiplied by 2 to obtain 24.
- 24 is not found in nums. Thus, 24 is returned.
```
```
Input: nums = [2,7,9], original = 4
Output: 4
Explanation:
- 4 is not found in nums. Thus, 4 is returned.
```
___

### Constraints 
* `1 <= nums.length <= 1000`
* `1 <= nums[i], original <= 1000`

```java
class Solution {
class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for (int i : nums) {
            if(i==original){
                original = original*2;
            }
        }
        return original;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/208176197-c291cf57-4b05-461a-ad58-429abbc66910.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/709e9034d74699d3d91eed849c647ed01994e797/Day41_Multiply_Values_By_2/code.java)
