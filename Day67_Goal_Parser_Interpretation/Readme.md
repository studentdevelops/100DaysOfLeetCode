# Day 67 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You own a Goal Parser that can interpret a string `command`. The command consists of an alphabet of `"G"`, `"()"` and/or `"(al)"` in some order. The Goal Parser will interpret `"G"` as the string `"G"`, `"()"` as the string `"o"`, and `"(al)"` as the string `"al"`. The interpreted strings are then concatenated in the original order.

Given the string `command`, return the Goal Parser's interpretation of command.

#### LeetCode Link: [Goal Parser Interpretation](https://leetcode.com/problems/goal-parser-interpretation/description/)
___


### Test Cases
```
Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".
```
```
Input: command = "G()()()()(al)"
Output: "Gooooal"
```
```
Input: command = "(al)G(al)()()G"
Output: "alGalooG"
```
___

### Constraints 
* `1 <= command.length <= 100`
* `command` consists of `"G"`, `"()"`, and/or `"(al)"` in some order.

```java
class Solution {
    public String interpret(String command) {
        String word = "";
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i) == 'G'){
                word = word + "G";
            } else if(command.charAt(i) == '('){
                if(command.charAt(i + 1) == ')'){
                    word = word + "o";
                    i++;
                } else if(command.charAt(i + 1) == 'a'){
                    word = word + "al";
                    i+=3;
                }
            }
        }
        return word;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/213937636-105abe41-b981-4995-86f3-4b52129769b5.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/cb373ec4077a09079e83f750489140691b7fdaca/Day67_Goal_Parser_Interpretation/code.java)
