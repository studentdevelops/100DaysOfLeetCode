# Day 42 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You are given an array of strings words and a string pref.

Return the number of strings in words that contain pref as a prefix.

A prefix of a string s is any leading contiguous substring of s.

#### LeetCode Link: [Keep Multiplying Found Values by Two]([https://leetcode.com/problems/keep-multiplying-found-values-by-two/description/](https://leetcode.com/problems/counting-words-with-a-given-prefix/description/))
___


### Test Cases
```
Example 1:

Input: words = ["pay","attention","practice","attend"], pref = "at"
Output: 2
Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
Example 2:

Input: words = ["leetcode","win","loops","success"], pref = "code"
Output: 0
Explanation: There are no strings that contain "code" as a prefix.
```
___

### Constraints 
* 1 <= words.length <= 100
* 1 <= words[i].length, pref.length <= 100
words[i] and pref consist of lowercase English letters.

```java
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String string : words) {
            if(string.startsWith(pref))
                count++;
        }
        return count;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/208312843-bfd49a98-6c16-457a-9145-2a51fb9fc7e9.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/main/Day42_counting_words_with_prefix/code.java)
