# Day 16 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a sentence that consists of some words separated by a single space, and a searchWord, check if searchWord is a prefix of any word in sentence.

Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. If searchWord is a prefix of more than one word, return the index of the first word (minimum index). If there is no such word return -1.

A prefix of a string s is any leading contiguous substring of s.

#### LeetCode Link: [Check If a Word Occurs As a Prefix of Any Word in a Sentence](https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/description/)
___


### Test Cases
```
Input: sentence = "this problem is an easy problem", searchWord = "pro"
Output: 2
Explanation: "pro" is prefix of "problem" which is the 2nd and the 6th word in the sentence, but we return 2 as it's the minimal index.
```
```
Input: sentence = "i am tired", searchWord = "you"
Output: -1
Explanation: "you" is not a prefix of any word in the sentence.
```
```
Input: sentence = "i love eating burger", searchWord = "burg"
Output: 4
Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
```
___

### Constraints 
* `1 <= sentence.length <= 100`
* `1 <= searchWord.length <= 10`
* `sentence` consists of lowercase English letters and spaces.
* `searchWord` consists of lowercase English letters.

```java
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String SentenceList[] = sentence.split(" ");
        for (int i = 0; i < SentenceList.length; i++) {
            if(SentenceList[i].startsWith(searchWord, 0)){
                return i+1;
            }
        }
        return -1;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/203254471-272109d1-232e-45c6-ba66-c04d30e206de.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/73f18feb98df130d3fa7d581f10abefa16bf8e6a/Dat15_Detect_Capital/code.java)
