# Day 13 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number in the range that is missing from the array.


#### LeetCode Link: [Missing Number](https://leetcode.com/problems/missing-number/description/)
___


### Test Cases
```
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
```
```
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
```
```
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
```
___

### Constraints 
* `n == nums.length`
* `1 <= n <= 10^4`
* `0 <= nums[i] <= n`
* All the numbers of `nums` are unique.

```java
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i!=nums[i]){
                return nums[i]-1;
            }
        }
        return nums[n-1]+1;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/225977508-81d5c8db-4309-4ffd-be6c-4883b44aec86.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/42d447454964024292de64c9a316bded7660306a/Day80_Missing_Number/code.java)
