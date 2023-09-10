# Day 97 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an integer `n`, return `true` if it is a power of three. Otherwise, return `false`.

An integer `n` is a power of `three`, if there exists an integer `x` such that `n == 3x`.

#### LeetCode Link: [Power of Three](https://leetcode.com/problems/power-of-three/description/)
___


### Test Cases
```
Input: n = 27
Output: true
Explanation: 27 = 3^3
```
```
Input: n = 0
Output: false
Explanation: There is no x where 3^x = 0.
```
```
Input: n = -1
Output: false
Explanation: There is no x where 3^x = (-1).
```
___

### Constraints 
* `-2^31 <= n <= 2^31 - 1`
* `word` consists of lowercase and uppercase English letters.

```java
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n < 1)
            return false;
        if (n == 1)
            return true;
        if (n % 3 != 0)
            return false;
        return isPowerOfThree(n/3);
    }
}
```
___
### Results
![image](https://github.com/studentdevelops/100DaysOfLeetCode/assets/31382363/794bf5fd-cc6a-4ff7-8269-6cccce7217db)

___

### Link to Github file  
* [java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/6f151e2bd8ae10b41a4666c0e3e9a8b31ee0fc44/Day97_Power_of_Three/code.java)
