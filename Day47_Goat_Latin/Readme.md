# Day 47 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You are given a string `sentence` that consist of words separated by spaces. Each word consists of lowercase and uppercase letters only.

We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.) The rules of Goat Latin are as follows:

If a word begins with a vowel (`'a'`, `'e'`, `'i'`, `'o'`, or `'u'`), append `"ma"` to the end of the word.
For example, the word `"apple"` becomes `"applema"`.
If a word begins with a consonant (i.e., not a vowel), remove the first letter and append it to the end, then add `"ma"`.
For example, the word `"goat"` becomes `"oatgma"`.
Add one letter `'a'` to the end of each word per its word index in the sentence, starting with `1`.
For example, the first word gets `"a"` added to the end, the second word gets `"aa"` added to the end, and so on.
Return the final sentence representing the conversion from sentence to Goat Latin.


#### LeetCode Link: [Goat Latin](https://leetcode.com/problems/goat-latin/description/)
___


### Test Cases
```
Input: sentence = "I speak Goat Latin"
Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
```
```
Input: sentence = "The quick brown fox jumped over the lazy dog"
Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
```
___

### Constraints 
* `1 <= sentence.length <= 150`
* `sentence` consists of English letters and spaces.
* `sentence` has no leading or trailing spaces.
* All the words in `sentence` are separated by a single space.

```java
class Solution {
    public boolean helper(String word) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        for (String string : vowels) {
            if(word.toLowerCase().startsWith(string)){
                return true;
            }
        }
        return false;
    }
    public String toGoatLatin(String sentence) {
        String[] senStrings = sentence.split(" ");
        for (int i = 0; i < senStrings.length; i++) {
            if(helper(senStrings[i])){
                senStrings[i] = senStrings[i] + "ma";
            } else {
                senStrings[i] = senStrings[i].substring(1) + senStrings[i].substring(0,1) + "ma";
            }
            for (int j = 0; j < i+1; j++) {
                senStrings[i] = senStrings[i] + "a";
            }
        }
        return String.join(" ", senStrings);
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/209798635-5c4fa52d-eee4-488a-9b95-64d2a630361d.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/c1d99fc3804e12fb37127fe3da14c8aaa6b39d46/Day47_Goat_Latin/code.java)
