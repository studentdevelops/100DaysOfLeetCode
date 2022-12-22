# Day 44 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

* Starting with any positive integer, replace the number by the sum of the squares of its digits.
* Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
* Those numbers for which this process ends in 1 are happy.

Return true if n is a happy number, and false if not.

#### LeetCode Link: [Happy Number](https://leetcode.com/problems/happy-number/description/)
___


### Test Cases
```
Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
```
```
Input: n = 2
Output: false
```
___

### Constraints 

* 1 <= n <= 2^31 - 1

```java
class Solution {
    public int helper(int n) {
        int sum = 0;
        while (n != 0) {
            int remainder = (n % 10) * (n % 10);
            sum += remainder;
            n = n / 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        if (n == 1)
            return true;
        while (n > 6) {
            n = helper(n);
        }
        if (n == 1)
            return true;
        return false;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/209216440-b0dfa55c-4df9-45f8-a2ac-5a505da92c23.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/main/Day44_Happy_Number/code.java)
