# Day 85 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a string `s`, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

#### LeetCode Link: Repeated Substring Pattern](https://leetcode.com/problems/repeated-substring-pattern/description/?envType=study-plan-v2&envId=programming-skills)
___


### Test Cases
```
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.
```
```
Input: s = "aba"
Output: false
```
```
Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
```
___

### Constraints 
* `1 <= s.length <= 10^4`
* `s` consists of lowercase English letters.

___
```java
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String substr = "";
        int n = s.length();

        for(int i = 1; i <= n / 2; i++){
            if(n % i == 0){ 
                substr = s.substring(0, i);
                if(s.replaceAll(substr, "").isEmpty())
                    return true;
            }
        }
        return false;
    }
}
```
___
### Results
![image](https://github.com/studentdevelops/100DaysOfLeetCode/assets/31382363/a8251209-b588-470a-9b1a-908b93371a70)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/e274165291de2b1678f4509dc746e4b8d53d9931/Day85_Repeated_SubString_Pattern/code.java)
