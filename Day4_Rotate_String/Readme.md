# Day 4 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

* For example, if s = "abcde", then it will be "bcdea" after one shift.

#### LeetCode Link: [Rotate String](https://leetcode.com/problems/rotate-string/)
___


### Test Cases
```
Input: s = "abcde", goal = "cdeab"
Output: true
```
```
Input: s = "abcde", goal = "abced"
Output: false
```
___

### Constraints 
* `1 <= s.length, goal.length <= 100`  
* `s and goal consist of lowercase English letters.`
___

```java
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
        return false;

        if( (s+s).indexOf(goal) >= 0 ){
            return true;
        } 
        return false;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/201170808-ad7203d5-2c71-405f-9a58-1b64ee7674b4.png)
___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/95da8360a5f13314f36d7a5c8b943c9496c3708c/Day4_Rotate_String/code.java)
