# Day 75 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You are given a string `allowed` consisting of distinct characters and an array of strings `words`. A string is consistent if all characters in the string appear in the string `allowed`.

Return the number of consistent strings in the array `words`.

#### LeetCode Link: [Count the Number of Consistent Strings](https://leetcode.com/problems/count-the-number-of-consistent-strings/description/)
___


### Test Cases
```
Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
```
```
Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.
```
```
Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
Output: 4
Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
```
___

### Constraints 
* `1 <= words.length <= 10^4`
* `1 <= allowed.length <= 26`
* `1 <= words[i].length <= 10`
* The characters in `allowed` are distinct.
* `words[i]` and `allowed` contain only lowercase English letters.

```java
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            boolean flag = true;
            for (int j = 0; j < words[i].length(); j++) {
                for (int j2 = 0; j2 < allowed.length(); j2++) {
                    if (!allowed.contains(String.valueOf(words[i].charAt(j)))) {
                        flag = false;
                        break;
                    } 
                }
            }
            if (flag) {
                count++;
            }
        }

        return count;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/218324443-6833a9ba-2f37-4fe4-9379-b6d425dd2cf0.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/c8fa1e3357e2dc7a2d16e15ca94f1b3dfddbfd89/Day75_Count_the_Number_Of_Consistent_Strings/code.java)
