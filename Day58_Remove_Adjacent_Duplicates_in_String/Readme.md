# Day 58 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You are given a string `s` consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

#### LeetCode Link: [Remove All Adjacent Duplicates In String](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/)
___


### Test Cases
```
Input: s = "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  
The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
```
```
Input: s = "azxxzy"
Output: "ay"
```
___

### Constraints 
* `1 <= s.length <= 10^5`
* `s` consists of lowercase English letters.

```java
class Solution {
    public String removeDuplicates(String s) {
       StringBuilder newS = new StringBuilder(s);
        for (int i = 0; i < newS.length()-1; i++) {
            if(newS.charAt(i) != newS.charAt(i+1)) continue;
            if(newS.charAt(i) == newS.charAt(i+1)){
                newS.delete(i, i+2);
                i = i==0?i-1:i-2;
            }
        }
        return newS.toString();
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/211395344-6e27157f-4b93-4888-b5c0-21d2bd4298b0.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/4c75a4aab97ca1fed4a359e1ebeff3aad615cda6/Day58_Remove_Adjacent_Duplicates_in_String/code.java)
