# Day 14 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.

The words in paragraph are case-insensitive and the answer should be returned in lowercase.

#### LeetCode Link: [Most Common Word](https://leetcode.com/problems/most-common-word/description/)
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
* `1 <= paragraph.length <= 1000`
* `paragraph` consists of English letters, space ' ', or one of the symbols: `"!?',;.".`.
* 0 <= `banned`.length <= 100
* 1 <= `banned[i]`.length <= 10
* `banned[i]` consists of only lowercase English letters.

```java
class Solution {
    public boolean bannedWord(String name, String[] banned) {
        if(banned.length == 0 ) return false;
        for (String words : banned) {
            if (name.equalsIgnoreCase(words)) {
                return true;
            }
        }
        return false;
    }
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] sen = paragraph.toLowerCase().split("[ !?',;.]+");
        int count = 0;
        String word = "";

        if(sen.length==1) return sen[0].toLowerCase();
        
        for (int i = 0; i < sen.length; i++) {
            if(bannedWord(sen[i], banned)){
                continue;
            }
            int innercount = 0;
            for (int j = 0; j < sen.length; j++) {
                if (bannedWord(sen[j], banned)) {
                    continue;
                }
                if (sen[i].equalsIgnoreCase(sen[j])) {
                    innercount++;
                }
            }
            if (innercount > count) {
                count = innercount;
                word = sen[i];
            }
        }
        return word;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/202874638-26d64788-01b1-4d9d-9f64-73af2183ae2f.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/bb72a260b12acbf2c66a98e2d146e6db6af3f3f7/Day14_Most_Common_Word/code.java)
