# Day 72 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an array of integers `nums`, return the number of good pairs.

A pair `(i, j)` is called good if `nums[i]` == `nums[j]` and `i` < `j`.

#### LeetCode Link: [Count Good Triplets](https://leetcode.com/problems/number-of-good-pairs/description/)
___


### Test Cases
```
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
```
```
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
```
```
Input: nums = [1,2,3]
Output: 0
```
___

### Constraints 
* `1 <= nums.length <= 100`
* `1 <= nums[i] <= 100`

```java
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/216786251-a88e46ae-6dae-4085-bb52-e5377e0e54d6.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/e5998ddaf14461329c673e595d9107766df8c9d2/Day72_Number_of_Good_Pairs/code.java)
