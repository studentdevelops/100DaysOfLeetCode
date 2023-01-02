# Day 52 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a string `s`, find the length of the longest substring without repeating characters.


#### LeetCode Link: [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/)
___


### Test Cases
```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
```
```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```
```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
```
___

### Constraints 
* `0 <= s.length <= 5 * 10^4`
* `s` consists of English letters, digits, symbols and spaces.

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size = s.length();
        String chars = "";
        int length = 0;
        for (int i = 0; i < size; i++) {
            if (i == 0)
                length = 1;
            if (chars.length() > length) {
                length = chars.length();
            }
            if (!chars.contains(Character.toString(s.charAt(i)))) {
                chars = chars + s.charAt(i);
            }
            else {
                chars = chars.substring(1, chars.length());
                i--;
            }
        }
        if (chars.length() > length) {
            length = chars.length();
        }
        return length;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/210271861-0e12a428-7ab3-4dbc-a99a-dda90aa3965b.png)


___

### Link to Github file
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/02f90479def5271d4c89b5bc7fdafc40004bd60a/Day52_Longest_Substring_Without__Repeating_Chatacters/code.java)
