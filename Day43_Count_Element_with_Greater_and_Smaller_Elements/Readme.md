# Day 43 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.

#### LeetCode Link: [Count Elements With Strictly Smaller and Greater Elements](https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/description/)
___


### Test Cases
```
Input: nums = [11,7,2,15]
Output: 2
Explanation: The element 7 has the element 2 strictly smaller than it and the element 11 strictly greater than it.
Element 11 has element 7 strictly smaller than it and element 15 strictly greater than it.
In total there are 2 elements having both a strictly smaller and a strictly greater element appear in nums.
```
```
Input: nums = [-3,3,3,90]
Output: 2
Explanation: The element 3 has the element -3 strictly smaller than it and the element 90 strictly greater than it.
Since there are two elements with the value 3, in total there are 2 elements having both a strictly smaller and a strictly greater element appear in nums.
```
___

### Constraints 

* 1 <= nums.length <= 100
* -105 <= nums[i] <= 105

```java
class Solution {
    public int countElements(int[] nums) {
        int count = 0;
        for (int i : nums) {
            int lesserCount = 0;
            int greaterCount = 0;
            for (int j : nums) {
                if (i > j && lesserCount <= 1) {
                    lesserCount++;
                }
                if (i < j && greaterCount <= 1) {
                    greaterCount++;
                }
                if (lesserCount >= 1 && greaterCount >= 1) {
                    break;
                }
            }
            if (lesserCount>= 1 && greaterCount >= 1) {
                count++;
            }
        }
        return count;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/208713474-810d6e58-9433-4d14-b861-6d077eabf5a1.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/main/Day43_Count_Element_with_Greater_and_Smaller_Elements/code.java)
