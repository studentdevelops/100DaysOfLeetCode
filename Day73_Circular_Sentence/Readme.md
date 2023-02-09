# Day 64 of `#100DaysOfLeetCode`

___
### Problem Statement:  
A `sentence` is a list of words that are separated by a single space with no leading or trailing spaces.

* For example, `"Hello World"`, `"HELLO"`, `"hello world hello world"` are all sentences.
Words consist of only uppercase and lowercase English letters. Uppercase and lowercase English letters are considered different.

A sentence is circular if:

* The last character of a word is equal to the first character of the next word.
* The last character of the last word is equal to the first character of the first word.
For example, `"leetcode exercises sound delightful"`, `"eetcode"`, `"leetcode eats soul"` are all circular sentences. However, `"Leetcode is cool"`, `"happy Leetcode"`, `"Leetcode"` and `"I like Leetcode"` are not circular sentences.

Given a string `sentence`, return `true` if it is circular. Otherwise, return `false`.


#### LeetCode Link: [Circular Sentence](https://leetcode.com/problems/circular-sentence/description/)
___


### Test Cases
```
Input: sentence = "leetcode exercises sound delightful"
Output: true
Explanation: The words in sentence are ["leetcode", "exercises", "sound", "delightful"].
- leetcode's last character is equal to exercises's first character.
- exercises's last character is equal to sound's first character.
- sound's last character is equal to delightful's first character.
- delightful's last character is equal to leetcode's first character.
The sentence is circular.
```
```
Input: sentence = "eetcode"
Output: true
Explanation: The words in sentence are ["eetcode"].
- eetcode's last character is equal to eetcode's first character.
The sentence is circular.
```
```
Input: sentence = "Leetcode is cool"
Output: false
Explanation: The words in sentence are ["Leetcode", "is", "cool"].
- Leetcode's last character is not equal to is's first character.
The sentence is not circular.
```
___

### Constraints 
* `1 <= sentence.length <= 500`
* `sentence` consist of only lowercase and uppercase English letters and spaces.
* The words in `sentence` are separated by a single space.
* There are no leading or trailing spaces.

```java
class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] senStrings = sentence.split(" ");
        if(senStrings.length == 1){
            return senStrings[0].charAt(0) == senStrings[0].charAt(senStrings[0].length() - 1);
        }
        for (int i = 0; i < senStrings.length; i++) {
            int curSize = senStrings[i].length() - 1;
            if(i == senStrings.length - 1){
                if(senStrings[i].charAt(curSize) != senStrings[0].charAt(0)){
                    return false;
                }
                continue;
            }
            if(senStrings[i].charAt(curSize) != senStrings[i + 1].charAt(0))
                return false;
        }
        return true;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/217929449-c976938e-40cf-4eac-a5c3-2908f9123000.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/fdd90f888c4183b9adc794c1946a7c3d84106fd1/Day73_Circular_Sentence/code.java)
