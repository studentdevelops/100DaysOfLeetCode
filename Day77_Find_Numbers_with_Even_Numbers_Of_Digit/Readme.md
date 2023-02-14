# Day 77 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an array `nums` of integers, return how many of them contain an even number of digits.


#### LeetCode Link: [Find Numbers with Even Number of Digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/)
___


### Test Cases
```
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
```
```
Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.
```
___

### Constraints 
* `1 <= nums.length <= 500`
* `1 <= nums[i] <= 10^5`

```java
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(String.valueOf(nums[i]).length() %2 == 0){
                count++;
            }
        }
        return count;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/218836373-d2615534-04c0-46f2-9cb3-c166d0ddbce2.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/5b30c93658d37c4bdc2b0035c5fa39bcbc2fddf7/Day77_Find_Numbers_with_Even_Numbers_Of_Digit/code.java)
