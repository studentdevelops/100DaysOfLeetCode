# Day 32 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a string `s` consisting of words and spaces, return the length of the last word in the string.

A word is a maximal `substring` consisting of non-space characters only.


#### LeetCode Link: [Length Of Last Word](https://leetcode.com/problems/length-of-last-word/description/)
___


### Test Cases
```
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
```
```
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
```
```
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
```
___

### Constraints 
* `1 <= s.length <= 10^4`
* `s` consists of only English letters and spaces `' '`.
* There will be at least one word in `s`.

```java
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i>=0 ; i--) {
            if(s.charAt(i) != ' '){
                count +=1;
            }
            else break;
        }
        return count;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/206304327-c7185212-fe2e-40d4-a566-7fd1f4035cd3.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/f6114c4b8ba1008607179109aa1b2066f5c85f70/Day32_Length_Of_Last_Word/code.java)
