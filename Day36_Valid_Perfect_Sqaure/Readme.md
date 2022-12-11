# Day 36 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as `sqrt`.

#### LeetCode Link: [Valid Perfect Square](https://leetcode.com/problems/valid-perfect-square/description/)
___


### Test Cases
```
Input: num = 16
Output: true
```
```
Input: num = 14
Output: false
```
___

### Constraints 
* `1 <= num <= 2^31 - 1`

___
```java
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1)
            return true;
        int size = String.valueOf(num).length();
        size *= size;
        for (int i = 2; i <= num / size; i++) {
            if (num % i != 0)
                continue;
            if (num % i == 0) {
                if (i * i == num) {
                    return true;
                }
            }
        }
        return false;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/206928487-a137ea84-57f8-4225-a802-441ee7ec39ee.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/855f12a2b939125224d8f4830530ee1e75bc482e/Day36_Valid_Perfect_Sqaure/code.java)
