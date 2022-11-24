# Day 19 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a string `s`, find the first non-repeating character in it and return its index. If it does not exist, return `-1`.

#### LeetCode Link: [First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/description/)
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
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/6fde60e164bf61a9b7ba81ee9fc89edf8b56ecce/DAy19_Firrst_Unique_Character/code.java)
