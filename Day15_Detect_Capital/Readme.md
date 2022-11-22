# Day 15 of `#100DaysOfLeetCode`

___
### Problem Statement:  
We define the usage of capitals in a word to be right when one of the following cases holds:

* All letters in this `word` are capitals, like `"USA"`.
* All letters in this `word` are not capitals, like `"leetcode"`.
* Only the first letter in this `word` is capital, like `"Google"`.
Given a string `word`, return `true` if the usage of capitals in it is right.

#### LeetCode Link: [Detect Capital](https://leetcode.com/problems/detect-capital/description/)
___


### Test Cases
```
Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
Output: "ball"
Explanation: 
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"), 
and that "hit" isn't the answer even though it occurs more because it is banned.
```
```
Input: paragraph = "a.", banned = []
Output: "a"
```
___

### Constraints 
* `1 <= word.length <= 100`
* `word` consists of lowercase and uppercase English letters.

```java
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toLowerCase()) || word.equals(word.toUpperCase()))
            return true;

        if(word.charAt(0) == word.toUpperCase().charAt(0)){
            if (word.substring(1).equals(word.substring(1).toLowerCase()))
            return true;
        }
        
        return false;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/202924503-c2fe5f60-7087-4710-85c7-c16a8fa09363.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/73f18feb98df130d3fa7d581f10abefa16bf8e6a/Dat15_Detect_Capital/code.java)
