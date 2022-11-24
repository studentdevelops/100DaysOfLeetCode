# Day 19 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a string `s`, find the first non-repeating character in it and return its index. If it does not exist, return `-1`.

#### LeetCode Link: [Valid Anagram](https://leetcode.com/problems/valid-anagram/description/)
___


### Test Cases
```
Input: s = "leetcode"
Output: 0
```
```
Input: s = "loveleetcode"
Output: 2
```
```
Input: s = "aabb"
Output: -1
```
___

### Constraints 
* `1 <= s.length <= 10^5`
* `s` consists of only lowercase English letters.

```java
class Solution {
    public int firstUniqChar(String s) {
        char[] ch = s.toCharArray();
        for (int i=0; i<ch.length ; i++) {
            boolean flag = false;
            for (int j=0; j<ch.length; j++) {
                if(i==j) continue;
                if(ch[i]==ch[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                return i;
            }
        }
        return -1;
    }
}
```
___
### Results
![Screenshot 2022-11-25 021758](https://user-images.githubusercontent.com/31382363/203861333-a4af3b8c-d334-4946-baa8-91a871309f1f.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/a7e295fbc636c53e837236545fc010b2a754d69c/Day18_Valid_Anagram/code.java)
* [Java Approch 2](https://github.com/studentdevelops/100DaysOfLeetCode/blob/a7e295fbc636c53e837236545fc010b2a754d69c/Day18_Valid_Anagram/code_2.java)
