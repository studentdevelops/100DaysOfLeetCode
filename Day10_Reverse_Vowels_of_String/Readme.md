# Day 10 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.


#### LeetCode Link: [Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/description/)
___


### Test Cases
```
Input: s = "hello"
Output: "holle"
```
```
Input: s = "leetcode"
Output: "leotcede"
```
___

### Constraints 
* `1 <= s.length <= 3 * 10^5`
* s consist of printable ASCII characters.

```java
class Solution {
    public Boolean isVowel(char sh) {
        char[] ch = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        for (char c : ch) {
            if (sh == c) {
                return true;
            }
        }
        return false;
    }

    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int size = s.length();
        int endChar = size - 1;
        int startChar = 0;
        while( startChar < endChar){
            if(!isVowel(charArray[startChar])){
                startChar++;
                continue;
            }

            if(!isVowel(charArray[endChar])){
                endChar--;
                continue;
            }

            char temp = charArray[startChar];
            charArray[startChar] = charArray[endChar];
            charArray[endChar] = temp;
            startChar++;
            endChar--;
        }

        return new String(charArray);
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/202024162-9a6b422f-683f-4bac-9d25-141d66e58a5c.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/d07ca7e3428a6d1da582d836abbf4ecee76373ea/Day10_Reverse_Vowels_of_String/code.java)
