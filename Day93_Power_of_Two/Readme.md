# Day 91 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an integer `n`, return `true` if it is a power of `two`. Otherwise, return `false`.

An integer `n` is a power of `two`, if there exists an integer `x` such that `n == 2x`.

 

#### LeetCode Link: [Power of Two](https://leetcode.com/problems/power-of-two/description/)
___


### Test Cases
```
Input: n = 1
Output: true
Explanation: 2^0 = 1
```
```
Input: n = 16
Output: true
Explanation: 2^4 = 16
```
```
Input: n = 3
Output: false
```
___

### Constraints 
* `-2^31 <= n <= 2^31 - 1`

```java
class Solution {
    public boolean isPowerOfTwo(int n) {
       if (n < 1)
            return false;
        if (n == 1)
            return true;
        if (n % 2 != 0)
            return false;
        return isPowerOfTwo(n / 2);
    }
}
```
___
### Results
![image](https://github.com/studentdevelops/100DaysOfLeetCode/assets/31382363/01546afb-f0a3-4a4d-8abb-fcd130d524a9)


___

### Link to Github file
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/8e7fde0b361394bc858ba1433c2e14ea6cfbc2c5/Day91_Baseball_Game/code.java)
