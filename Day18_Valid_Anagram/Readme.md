# Day 18 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

#### LeetCode Link: [Valid Anagram](https://leetcode.com/problems/valid-anagram/description/)
___


### Test Cases
```
Input: s = "rat", t = "car"
Output: false
```
```
Input: s = "anagram", t = "nagaram"
Output: true
```
___

### Constraints 
* 1 <= `s.length`, `t.length` <= 5 * 10^4
* `s` and `t` consist of lowercase English letters.

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
![image](https://user-images.githubusercontent.com/31382363/203654661-cdba273f-ef5a-4a55-ac0e-0dc876dcc206.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/a7e295fbc636c53e837236545fc010b2a754d69c/Day18_Valid_Anagram/code.java)
* [Java Approch 2](https://github.com/studentdevelops/100DaysOfLeetCode/blob/a7e295fbc636c53e837236545fc010b2a754d69c/Day18_Valid_Anagram/code_2.java)
