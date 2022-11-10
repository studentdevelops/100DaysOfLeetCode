# Day 3 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

#### LeetCode Link: [Reverse String]((https://leetcode.com/problems/reverse-string/description/)
___


### Test Cases
```
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
```
```
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
```
___

### Constraints 
* `1 <= s.length <= 10^5`  
* `s[i] is a printable ascii character.`
___

```java
class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char temp = s[i];
            s[i] = s[ ( s.length - 1 ) - i ];
            s[ ( s.length - 1 ) - i ] = temp;
        }
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/200906533-811bcbc6-a4f4-4b8b-93be-ee1a8dcd5af6.png)
___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/9ca49b4d01d7ea49fa08d3a40e21c06e9f8bf7c3/Day3_Reverse_String/code.java)
