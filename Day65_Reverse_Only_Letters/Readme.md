# Day 65 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a string `s`, reverse the string according to the following rules:

* All the characters that are not English letters remain in the same position.
* All the English letters (lowercase or uppercase) should be reversed.
Return `s` after reversing it

#### LeetCode Link: [Reverse Only Letters](https://leetcode.com/problems/reverse-only-letters/description/)
___


### Test Cases
```
Input: s = "ab-cd"
Output: "dc-ba"
```
```
Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
```
```
Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
```
___

### Constraints 
* `1 <= s.length <= 100`
* `s` consists of characters with ASCII values in the range `[33, 122]`.
* `s` does not contain `'\"'` or `'\\'`.

```java
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] wordChar = new char[s.length()];
        int start = 0, end = s.length() - 1;
        while (start < wordChar.length && end > -1 ) {
            if(!((s.charAt(start) >='A' && s.charAt(start) <= 'Z') || 
            (s.charAt(start) >='a' && s.charAt(start) <= 'z'))){
                wordChar[start] = s.charAt(start);
                start++;
                continue;
            }
            if(!((s.charAt(end) >='A' && s.charAt(end) <= 'Z') || 
            (s.charAt(end) >='a' && s.charAt(end) <= 'z'))){
                wordChar[end] = s.charAt(end);
                end--;
                continue;
            }
            if((s.charAt(start) >='A' && s.charAt(start) <= 'Z') || 
            (s.charAt(start) >='a' && s.charAt(start) <= 'z')){
                wordChar[start] = s.charAt(end);
                wordChar[end] = s.charAt(start);
            }
            start++;
            end--;

        }
        return String.valueOf(wordChar);
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/213796292-dfdd807c-ade6-48ff-81f6-8861d6d1754c.png)
___
![image](https://user-images.githubusercontent.com/31382363/213796242-ce1712a3-f839-4574-ae13-d1a4e8bbb7b0.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/5ee842e47315bb6d48ba19e8e5fa8184d03e8e1d/Day65_Reverse_Only_Letters/code.java)
* [Java 2](https://github.com/studentdevelops/100DaysOfLeetCode/blob/c2ebd6c63ab2f80757bca83b5104c074188fdebb/Day65_Reverse_Only_Letters/code2.java)
