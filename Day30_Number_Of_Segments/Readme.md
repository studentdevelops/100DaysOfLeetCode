# Day 30 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a string `s`, return the number of segments in the string.

A segment is defined to be a contiguous sequence of non-space characters.

#### LeetCode Link: [Number of Segments in a String](https://leetcode.com/problems/number-of-segments-in-a-string/description/)
___


### Test Cases
```
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
```
```
Input: s = "Hello"
Output: 1
```
___

### Constraints 
* `0 <= s.length <= 300`
* `s` consists of lowercase and uppercase English letters, digits, or one of the following characters `"!@#$%^&*()_+-=',.:"`.
* `s` does not contain any leading or trailing spaces.
* The only space character in `s` is `' '`.

```java
class Solution {
    public int countSegments(String s) {
        s = s.trim();
        int size = s.length();
        if (size == 0) {
            return 0;
        }
        int count = 1;
        for (int i = 1; i < size - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') {
                count++;
            }
        }
        return count;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/205735838-705c569d-400b-42b9-87b4-c0b665f43ddb.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/416ad6e47b3ae908acc2d65bb2036a5e9420f007/Day30_Number_Of_Segments/code.java)
