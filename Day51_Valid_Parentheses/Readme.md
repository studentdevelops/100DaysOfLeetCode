# Day 51 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and '`]'`, determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


#### LeetCode Link: [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/description/)
___


### Test Cases
```
Input: s = "()"
Output: true
```
```
Input: s = "()[]{}"
Output: true
```
```
Input: s = "(]"
Output: false
```
___

### Constraints 
* `1 <= nums.length <= 3 * 10^4`
* `-3 * 10^4 <= nums[i] <= 3 * 10^4`
* Each element in the array appears twice except for one element which appears only once.

```java
class Solution {
    public boolean isValid(String s) {
        Stack<Character> parenStack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                parenStack.push(')');
            else if (c == '{')
                parenStack.push('}');
            else if (c == '[')
                parenStack.push(']');
            else if (parenStack.isEmpty() || parenStack.pop() != c)
                return false;
        }
        return parenStack.isEmpty();
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/210183269-29c7d4e9-80c8-4e39-8f63-0d0d1c64d606.png)


___

### Link to Github file
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/6fabb9d10544a5b1acfbe7b588c7e9d3dcb60194/Day51_Valid_Parentheses/code.java)
