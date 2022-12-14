# Day 7 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You are given a 0-indexed string s that has lowercase English letters in its even indices and digits in its odd indices.

There is a function shift(c, x), where c is a character and x is a digit, that returns the xth character after c.

For example, shift('a', 5) = 'f' and shift('x', 0) = 'x'.
For every odd index i, you want to replace the digit s[i] with shift(s[i-1], s[i]).

Return s after replacing all digits. It is guaranteed that shift(s[i-1], s[i]) will never exceed 'z'.

#### LeetCode Link: [Replace All Digits with characters](https://leetcode.com/problems/replace-all-digits-with-characters/description/)
___


### Test Cases
```
Input: s = "a1c1e1"
Output: "abcdef"
Explanation: The digits are replaced as follows:
- s[1] -> shift('a',1) = 'b'
- s[3] -> shift('c',1) = 'd'
- s[5] -> shift('e',1) = 'f'
```
```
Input: s = "a1b2c3d4e"
Output: "abbdcfdhe"
Explanation: The digits are replaced as follows:
- s[1] -> shift('a',1) = 'b'
- s[3] -> shift('b',2) = 'd'
- s[5] -> shift('c',3) = 'f'
- s[7] -> shift('d',4) = 'h'
```
___

### Constraints 
* `1 <= s.length <= 100`
* `s consists only of lowercase English letters and digits.`
* `shift(s[i-1], s[i]) <= 'z' for all odd indices i.`
___

```java
class Solution {
    public String replaceDigits(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 1; i < charArray.length; i+=2) {
            charArray[i] = (char) (charArray[i-1] + charArray[i] - '0');
        }
        return String.valueOf(charArray);
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/201526543-ee4c2947-2cc0-4a69-9bce-62293d87c3d7.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/11993bdd49d239a76221ce8c7773a955870251f0/Day7_Replace%20Digit_With_Characters/code.java) 
