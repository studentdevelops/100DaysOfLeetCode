# Day 9 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.


#### LeetCode Link: [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/description/)
___


### Test Cases
```
Input: nums = [1,2,3,1]
Output: true
```
```
Input: nums = [1,2,3,4]
Output: false
```
```
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
```
___

### Constraints 
* `1 <= nums.length <= 10^5`
* `-10^9<= nums[i] <= 10^9`

```java
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
 
        for (int t : nums) {
            set.add(t);
        }
        
        return !(set.size() == nums.length);
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/201763397-9a17dd24-c1da-418e-8bc1-3c9e52fe6f9e.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/edb84b5b228f9f17cd7d000e771ff86964dc838e/Day9_Contains_Duplicates/code.java)
