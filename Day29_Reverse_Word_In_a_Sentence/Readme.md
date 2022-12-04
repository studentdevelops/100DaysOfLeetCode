# Day 29 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a string `s`, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

#### LeetCode Link: [Reverse Words in a String III](https://leetcode.com/problems/reverse-words-in-a-string-iii/description/)
___


### Test Cases
```
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
```
```
Input: s = "God Ding"
Output: "doG gniD"
```
___

### Constraints 
* `1 <= s.length <= 5 * 10^4`
* `s` contains printable ASCII characters.
* `s` does not contain any leading or trailing spaces.
* There is at least one word in `s`.
* All the words in `s` are separated by a single space.

```java
class Solution {
    public String reverseWords(String s) {
        int size = s.length();
        if(size==1 || size == 0)
            return s;
        String[] sentence = s.split(" ");
        String returningSentence = "";
        for (int i = 0; i < sentence.length; i++) {
            char[] sArray = sentence[i].toCharArray();
            for (int j = 0; j < sArray.length/2; j++) {
                char temp = sArray[j];
                sArray[j] = sArray[(sArray.length - 1) - j];
                sArray[(sArray.length - 1) - j] = temp;
            }
            if(i!= sentence.length - 1)
                returningSentence += String.valueOf(sArray) + " ";
            else returningSentence += String.valueOf(sArray);
        }
        return returningSentence;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/205514762-e4636050-a97a-4e1d-9168-9f78c166fa96.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/822e7cde751090cc327d72242d7e4e6e3acf7e98/Day29_Reverse_Word_In_a_Sentence/code.java)
