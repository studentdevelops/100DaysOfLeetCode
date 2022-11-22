# Day 17 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an integer` x`, return `true` if x is a palindrome, and `false` otherwise.

#### LeetCode Link: [Palindrome Number](https://leetcode.com/problems/palindrome-number/description/)
___


### Test Cases
```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
```
```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
```
```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
```
___

### Constraints 
* `-2^31 <= x <= 2^31 - 1`

```java
class Solution {
    public boolean isPalindrome(int x) {
        if(x< 0) return false;
        int reverse = 0;
        int original = x;
        while(x!=0){
            reverse = reverse * 10 + (x%10);
            x /= 10;
        }
        if(original==reverse) return true;
        return false;
    }
}
```
```py
class Solution:
    def isPalindrome(self, x: int) -> bool:
        x  = str(x)
        if(x ==x[::-1]):
            return True
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/203414828-9838d199-e355-4127-ba2a-6434f79778fe.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/dde82a2f1ca2e2caca3b2428fa3a0dd888c85610/Day17_Palindrome_Number/JavaCode.java)
* [Python Approch 1](https://github.com/studentdevelops/100DaysOfLeetCode/blob/dde82a2f1ca2e2caca3b2428fa3a0dd888c85610/Day17_Palindrome_Number/pythonApproch1.py)
* [Python Approch 2](https://github.com/studentdevelops/100DaysOfLeetCode/blob/dde82a2f1ca2e2caca3b2428fa3a0dd888c85610/Day17_Palindrome_Number/pythonApproch2.py)
