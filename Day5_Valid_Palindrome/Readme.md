# Day 5 of `#100DaysOfLeetCode`

___
### Problem Statement:  
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

#### LeetCode Link: [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/description/)
___


### Test Cases
```
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
```
```
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
```
```
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
```
___

### Constraints 
* `1 <= s.length <= 2 * 105`  
* `s consists only of printable ASCII characters.`
___

```java
class Solution {
    public boolean isPalindrome(String s) {
        String filteredString = s.replaceAll( "[^a-zA-Z0-9]", "").toLowerCase();
        if(filteredString.length() == 0 || filteredString.length() == 1)
            return true;
        
        int size = filteredString.length();
        for (int i = 0, j=size - 1; i < size / 2; i++, j--) {
            // System.out.println(i+":"+j);
            if(filteredString.charAt(i) != filteredString.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/201403180-3d9227f3-d35c-4f15-a5ae-c1dcbf742320.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/95da8360a5f13314f36d7a5c8b943c9496c3708c/Day4_Rotate_String/code.java)
