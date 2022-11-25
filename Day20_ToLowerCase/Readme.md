# Day 20 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

#### LeetCode Link: [To Lower Case](https://leetcode.com/problems/to-lower-case/description/)
___


### Test Cases
```
Input: s = "Hello"
Output: "hello"
```
```
Input: s = "here"
Output: "here"
```
```
Input: s = "LOVELY"
Output: "lovely"
```
___

### Constraints 
* `1 <= s.length <= 100`
* `s` consists of printable ASCII characters.

```java
class Solution {
    public String toLowerCase(String s) {
        char[] UpperCaseArray = s.toLowerCase().toCharArray();
        char[] biggerArray = s.toCharArray();
        for (int i = 0; i < biggerArray.length; i++) {
            if(biggerArray[i] == UpperCaseArray[i]) continue;
            biggerArray[i] =  (char) (biggerArray[i] + 32);
        }
        
        return new String(biggerArray);
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/204052528-21fda818-7a5c-4576-ad87-d2a5d469ae62.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/a7e295fbc636c53e837236545fc010b2a754d69c/Day18_Valid_Anagram/code.java)
* [Java Approch 2](https://github.com/studentdevelops/100DaysOfLeetCode/blob/a7e295fbc636c53e837236545fc010b2a754d69c/Day18_Valid_Anagram/code_2.java)
