# Day 99 of `#100DaysOfLeetCode`

___
### Problem Statement:  
An ugly number is a positive integer whose prime factors are limited to `2`, `3`, and `5`.

Given an integer `n`, return `true` if n is an ugly number.


#### LeetCode Link: [Ugly Number](https://leetcode.com/problems/ugly-number/description/)
___


### Test Cases
```
Input: n = 6
Output: true
Explanation: 6 = 2 × 3
```
```
Input: n = 1
Output: true
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
```
```
Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.
```
___

### Constraints 
* `-2^31 <= n <= 2^31 - 1`

```java
class Solution {
    public boolean isUgly(int n) {
      if (n <= 0) {
            return false;
        }
        
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        
        return n == 1;
    }
}
```
___
### Results
![image](https://github.com/studentdevelops/100DaysOfLeetCode/assets/31382363/273fdd31-cfde-4988-956f-1110ac8abb18)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/aee36581f6b9d13f73653495c36d1c870108ce5b/Day99_Ugly_Number/code.java)
