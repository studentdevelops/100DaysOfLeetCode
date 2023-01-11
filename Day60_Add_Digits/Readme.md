# Day 60 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an integer `num`, repeatedly add all its digits until the result has only one digit, and return it.


#### LeetCode Link: [Add Digits](https://leetcode.com/problems/add-digits/description/)
___


### Test Cases
```
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
```
```
Input: num = 0
Output: 0
```
___

### Constraints 
* `0 <= num <= 2^31 - 1`

```java
class Solution {
    public int addDigits(int num) {
        while(num>=10){
            char[] charNum = String.valueOf(num).toCharArray();
            int newNum = 0;
            for (int i = 0; i < charNum.length; i++) {
                newNum = newNum + Integer.parseInt(String.valueOf(charNum[i]));
            }
            num = newNum;
        }
        return num;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/211896894-d7eae031-4902-4054-8f43-adb3d0bd163a.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/bc241509fd308fbfbe89358edc1c5603d71b1555/Day60_Add_Digits/code.java)
