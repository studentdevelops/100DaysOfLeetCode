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
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/b13249eb9add861d7904aa4b72b4fb496eb1facf/Day20_ToLowerCase/code.java)
