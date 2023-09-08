# Day 96 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a `pattern` and a string `s`, find if `s` follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in `pattern` and a non-empty word in `s`.


#### LeetCode Link: [Word Pattern](https://leetcode.com/problems/word-pattern/description/)
___


### Test Cases
```
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
```
```
Input: pattern = "abba", s = "dog cat cat fish"
Output: false
```
```
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
```
___

### Constraints 
* `1 <= pattern.length <= 300`
* `pattern` contains only lower-case English letters.
* `1 <= s.length <= 3000`
* `s` contains only lowercase English letters and spaces `' '`.
* `s` does not contain any leading or trailing spaces.
* All the words in s are separated by a single space.

```java
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, String> words = new HashMap<String, String>();
        String[] sWords = s.split(" ");
        String[] patternArr = pattern.split("");
        if (sWords.length != patternArr.length) {
            return false;
        }
        for (int i = 0; i < sWords.length; i++) {
            if (words.containsKey(patternArr[i])) {
                if (!(words.get(patternArr[i]).equals(sWords[i]))) {
                    return false;
                }
            } else {
                if(!(words.containsValue(sWords[i]))){
                    words.put(patternArr[i], sWords[i]);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
```
___
### Results
![image](https://github.com/studentdevelops/100DaysOfLeetCode/assets/31382363/3fcf0ac8-1348-485c-b537-af0208bf1549)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/911314ae84c3461706c6e3cb9abd908c4922ea21/Day96_Word_Pattern/code.java)
