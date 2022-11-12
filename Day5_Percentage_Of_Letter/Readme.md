# Day 5 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a string s and a character letter, return the percentage of characters in s that equal letter rounded down to the nearest whole percent.

#### LeetCode Link: [Percentage of a Letter in String]((https://leetcode.com/problems/percentage-of-letter-in-string/description/))

___


### Test Cases
```
Input: s = "foobar", letter = "o"
Output: 33
Explanation:
The percentage of characters in s that equal the letter 'o' is 2 / 6 * 100% = 33% when rounded down, so we return 33.
```
```
Input: s = "jjjj", letter = "k"
Output: 0
Explanation:
The percentage of characters in s that equal the letter 'k' is 0%, so we return 0.
```
___

### Constraints 
* `1 <= s.length <= 100`  
* `s consists only of printable ASCII characters.`
* `letter is a lowercase English letter.`
___

```java
class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if(s.charAt(i) == letter){
                count+=1;
            }
        }
        int percentage = (int) Math.round((count* 100) /size)  ;
        return percentage ;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/201486503-eb1be49c-874d-48e4-b27d-6b7ffd0e009e.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/988964166c16285102bc7766297c55f82d715434/Day5_Valid_Palindrome/code.java)
* [Java Recurrsive](https://github.com/studentdevelops/100DaysOfLeetCode/blob/988964166c16285102bc7766297c55f82d715434/Day5_Valid_Palindrome/alternativeCode.java)
