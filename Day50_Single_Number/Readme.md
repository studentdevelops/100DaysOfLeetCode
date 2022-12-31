# Day 50 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.


#### LeetCode Link: [Single Number](https://leetcode.com/problems/single-number/description/)
___


### Test Cases
```
Input: nums = [2,2,1]
Output: 1
```
```
Input: nums = [4,1,2,1,2]
Output: 4
```
```
Input: nums = [1]
Output: 1
```
___

### Constraints 
* `1 <= nums.length <= 3 * 10^4`
* `-3 * 10^4 <= nums[i] <= 3 * 10^4`
* Each element in the array appears twice except for one element which appears only once.

```java
class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> hmp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hmp.put(nums[i], hmp.getOrDefault(nums[i], 0) + 1);
        }
        for (int i : nums) {
            if(hmp.get(i) == 1){
                return i;
            }
        }
        return 0;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/210152741-bf6a95ac-d033-42df-861d-bb155024d824.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/ad2b2ecdd6f04eef9df75a37e0c61adba7262404/Day50_Single_Number/code.java)
