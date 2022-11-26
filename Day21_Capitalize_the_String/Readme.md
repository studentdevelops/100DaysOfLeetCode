# Day 21 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You are given a string title consisting of one or more words separated by a single space, where each word consists of English letters. Capitalize the string by changing the capitalization of each word such that:

If the length of the word is 1 or 2 letters, change all letters to lowercase.
Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
Return the capitalized title.

#### LeetCode Link: [Capitalize the Title](https://leetcode.com/problems/capitalize-the-title/description/)
___


### Test Cases
```
Input: title = "capiTalIze tHe titLe"
Output: "Capitalize The Title"
Explanation:
Since all the words have a length of at least 3, the first letter of each word is uppercase, and the remaining letters are lowercase.
```
```
Input: title = "First leTTeR of EACH Word"
Output: "First Letter of Each Word"
Explanation:
The word "of" has length 2, so it is all lowercase.
The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase, and the remaining letters are lowercase.
```
```
Input: title = "i lOve leetcode"
Output: "i Love Leetcode"
Explanation:
The word "i" has length 1, so it is lowercase.
The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase, and the remaining letters are lowercase.
```
___

### Constraints 
* `1 <= title.length <= 100`
* `title` consists of words separated by a single space without any leading or trailing spaces.
* Each word consists of uppercase and lowercase English letters and is non-empty.

```java
class Solution {
    public String capitalizeTitle(String title) {
        title = title.trim().toLowerCase();
        String[] sen = title.split(" ");
        String newTitle ="";
        for (int i = 0; i < sen.length; i++) {
            if(sen[i].length() > 2){
                sen[i] = sen[i].substring(0,1).toUpperCase() +  sen[i].substring(1);
            }
            if(i!=sen.length-1){
                newTitle = newTitle + sen[i] + " ";
                continue;
            }
            newTitle = newTitle + sen[i];
        }
        
        return newTitle;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/204109997-130cd697-646c-4d45-8bb6-6738a06afec1.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/b13249eb9add861d7904aa4b72b4fb496eb1facf/Day20_ToLowerCase/code.java)
