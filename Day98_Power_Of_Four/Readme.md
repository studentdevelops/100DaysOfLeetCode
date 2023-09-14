# Day 98 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an integer `n`, return `true` if it is a power of four. Otherwise, return `false`.

An integer `n` is a power of four, if there exists an integer `x` such that `n == 4^x`.


#### LeetCode Link: [Power of Four](https://leetcode.com/problems/power-of-four/description/)
___


### Test Cases
```
Input: n = 16
Output: true
```
```
Input: n = 5
Output: false
```
```
Input: n = 1
Output: true
```
___

### Constraints 
* `-2^31 <= n <= 2^^31 - 1`

```java
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n < 1)
            return false;
        if (n == 1)
            return true;
        if (n % 4 != 0)
            return false;
        return isPowerOfFour(n / 4);
    }
}
```
___
### Results
![image](https://github.com/studentdevelops/100DaysOfLeetCode/assets/31382363/624ce98c-5b38-47ee-8ab4-9b48adf3d875)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/6071c09131459b10e75ae4aa52cdc17f59415515/Day34_Search_Insert_Position/code.java)
