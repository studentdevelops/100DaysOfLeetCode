# Day 76 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a 0-indexed string `word` and a character `ch`, reverse the segment of `word` that starts at index `0` and ends at the index of the first occurrence of `ch` (inclusive). If the character `ch` does not exist in `word`, do nothing.

For example, if `word = "abcdefd"` and `ch = "d"`, then you should reverse the segment that starts at `0` and ends at `3` (inclusive). The resulting string will be `"dcbaefd"`.
Return the resulting string.

#### LeetCode Link: [Reverse Prefix of Word](https://leetcode.com/problems/reverse-prefix-of-word/description/)
___


### Test Cases
```
Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3. 
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
```
```
Input: word = "xyxzxe", ch = "z"
Output: "zxyxxe"
Explanation: The first and only occurrence of "z" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".
```
```
Input: word = "abcd", ch = "z"
Output: "abcd"
Explanation: "z" does not exist in word.
You should not do any reverse operation, the resulting string is "abcd".
```
___


### Constraints 
* `1 <= word.length <= 250`
* `word` consists of lowercase English letters.
* `ch` is a lowercase English letter.


___
```java
class Solution {
    public String reversePrefix(String word, char ch) {
        String fString = "";
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ch){
                fString = fString + word.charAt(i);
                for (int j = i-1; j >= 0; j--) {
                    fString = fString + word.charAt(j);
                }
                fString = fString + word.substring(i + 1, word.length());
                break;
            }
        }
        return fString.length() == 0 ? word : fString;
    }
}
```


___
### Results
![image](https://user-images.githubusercontent.com/31382363/218560624-73223300-5ed1-4dc5-a461-25df38c13409.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/f9d4f0b88dc84d93353f144a95c9f17f722a335f/Day76_Reverse_Prefix_Of_A_Word/code.java)
