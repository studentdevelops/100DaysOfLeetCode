# Day 69 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You are given two strings `word1` and `word2`. Merge the strings by adding letters in alternating order, starting with `word1`. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

 

#### LeetCode Link: [Merge Strings Alternately](https://leetcode.com/problems/merge-strings-alternately/description/)
___


### Test Cases
```
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
```
```
Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
```
```
Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
```
___

### Constraints 
* `1 <= word1.length, word2.length <= 100`
* `word1` and `word2` consist of lowercase English letters.

```java
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1Length = word1.length();
        int w2Length = word2.length();
        String newWord = "";
        int k = 0;
        int j = 0;
        for (int i = 0; i < w1Length + w2Length; i++) {
            if (k < w1Length) {
                if (i % 2 == 0) {
                    newWord = newWord + word1.charAt(k);
                    k++;
                }
            } else if (k >= w1Length && j < w2Length) {
                newWord = newWord + word2.charAt(j);
                j++;
            }

            if (j < w2Length) {
                if (i % 2 != 0) {
                    newWord = newWord + word2.charAt(j);
                    j++;
                }
            } else if (j >= w2Length && k < w1Length) {
                newWord = newWord + word1.charAt(k);
                k++;
            }
        }
        return newWord;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/214686973-86bfdc8a-3f4f-4eff-b1a9-3664ff5d10f8.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/92a2be55f48f42347b90145d5ea13be37e0f5a4f/Day69_Merge_Strings_Alternately/code.java)
