# Day 74 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You are given a string `s` of even length. Split this string into two halves of equal lengths, and let `a` be the first half and `b` be the second half.

Two strings are alike if they have the same number of vowels (`'a'`, `'e'`, `'i'`, `'o'`, `'u'`, `'A'`, `'E'`, `'I'`, `'O'`, `'U'`). Notice that `s` contains uppercase and lowercase letters.

Return `true` if `a` and `b` are alike. Otherwise, return `false`.

#### LeetCode Link: [Determine if String Halves Are Alike](https://leetcode.com/problems/determine-if-string-halves-are-alike/description/)
___


### Test Cases
```
Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
```
```
Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
```
___

### Constraints 
* `2 <= s.length <= 1000`
* `s.length` is even.
* `s` consists of uppercase and lowercase letters.

```java
class Solution {
    public boolean checker(char ch){
        char[] vowelArray = { 'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowelArray.length; i++) {
            if(vowelArray[i] == ch)
            return true;
        }
        return false;
    }
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int size = s.length() / 2;
        String firstHalf = s.substring(0, size);
        String secondHalf = s.substring(size);
        int firstCount = 0, secondCount = 0;

        for (int i = 0; i < size; i++) {
            if(this.checker(firstHalf.charAt(i))){
                firstCount++;
            }
            if(this.checker(secondHalf.charAt(i))){
                secondCount++;
            }
        }
        return firstCount == secondCount;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/218191305-dcc48a3a-84ce-49c2-8f21-03b19bdb02c5.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/dc0354bd0a4897831bb9875b66b469838ed60fc7/Day74_Determine_If_String_Halves_Are_Alike/code.java)
