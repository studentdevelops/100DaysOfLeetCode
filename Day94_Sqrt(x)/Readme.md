# Day 94 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a non-negative integer `x`, return the square root of `x` rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use `pow(x, 0.5)` in c++ or `x ** 0.5` in python.
 

 

#### LeetCode Link: [Sqrt(x)](https://leetcode.com/problems/sqrtx/description/)
___


### Test Cases
```
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
```
```
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
```
___

### Constraints 
* `0 <= x <= 2^31 - 1`

```java
class Solution {
    public int mySqrt(int x) {
        int count = 0;
        int n = x, i = 1;
        while (n != 0 && !(n<0)) {
            n -= i;
            if(n<0){
                count--;
            }
            count++;
            i += 2;
        }
        return count;
    }
}
```
___
### Results
![image](https://github.com/studentdevelops/100DaysOfLeetCode/assets/31382363/821f78d7-c481-4077-b356-2c2091c3ee7e)


___

### Link to Github file
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/eed9079bb7f43e18f9dfea15fb6b70e7c87479d3/Day93_Power_of_Two/code.java)
