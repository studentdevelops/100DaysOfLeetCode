# Day 77 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an array of positive integers `nums`, return an array `answer` that consists of the digits of each integer in `nums` after separating them in the same order they appear in `nums`.

To separate the digits of an integer is to get all the digits it has in the same order.

* For example, for the integer `10921`, the separation of its digits is `[1,0,9,2,1]`.
 


#### LeetCode Link: [Separate the Digits in an Array](https://leetcode.com/problems/separate-the-digits-in-an-array/description/)
___


### Test Cases
```
Input: nums = [13,25,83,77]
Output: [1,3,2,5,8,3,7,7]
Explanation: 
- The separation of 13 is [1,3].
- The separation of 25 is [2,5].
- The separation of 83 is [8,3].
- The separation of 77 is [7,7].
answer = [1,3,2,5,8,3,7,7]. Note that answer contains the separations in the same order.
```
```
Input: nums = [7,1,3,9]
Output: [7,1,3,9]
Explanation: The separation of each integer in nums is itself.
answer = [7,1,3,9].
```
___

### Constraints 
* `1 <= nums.length <= 1000`
* `1 <= nums[i] <= 10^5`

```java
class Solution {
    public int[] separateDigits(int[] nums) {
        String stringNumbers = "";
        for (int i : nums) {
            stringNumbers += String.valueOf(i);
        }
        int[] numsArray = new int[stringNumbers.length()];
        for (int i = 0; i < numsArray.length; i++) {
            numsArray[i] = Integer.parseInt(String.valueOf(stringNumbers.charAt(i)));
        }
        return numsArray;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/219144823-e445b032-f106-46c6-9a42-416ead127b60.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/f3896fe9150fb2517a906ac1aef5e624468ca17f/Day77_Seperate_The_Digits_In_Array/code.java)
