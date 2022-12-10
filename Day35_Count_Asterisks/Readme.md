# Day 35 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You are given a string `s`, where every two consecutive vertical bars `'|'` are grouped into a pair. In other words, the 1st and 2nd `'|'` make a pair, the 3rd and 4th `'|'` make a pair, and so forth.

Return the number of `'*'` in s, excluding the `'*'` between each pair of `'|'`.

Note that each `'|'` will belong to exactly one pair.


#### LeetCode Link: [Count Asterisks](https://leetcode.com/problems/count-asterisks/description/)
___


### Test Cases
```
Input: s = "l|*e*et|c**o|*de|"
Output: 2
Explanation: The considered characters are underlined: "l|*e*et|c**o|*de|".
The characters between the first and second '|' are excluded from the answer.
Also, the characters between the third and fourth '|' are excluded from the answer.
There are 2 asterisks considered. Therefore, we return 2.
```
```
Input: s = "iamprogrammer"
Output: 0
Explanation: In this example, there are no asterisks in s. Therefore, we return 0.
```
```
Input: s = "yo|uar|e**|b|e***au|tifu|l"
Output: 5
Explanation: The considered characters are underlined: "yo|uar|e**|b|e***au|tifu|l". There are 5 asterisks considered. Therefore, we return 5.Input: s = "yo|uar|e**|b|e***au|tifu|l"
Output: 5
Explanation: The considered characters are underlined: "yo|uar|e**|b|e***au|tifu|l". There are 5 asterisks considered. Therefore, we return 5.
```
___

### Constraints 
* `1 <= s.length <= 1000`
* `s` consists of lowercase English letters, vertical bars `'|'`, and asterisks `'*'`
* `s` contains an even number of vertical bars `'|'`

```java
class Solution {
    public int countAsterisks(String s) {
        int lineCount = 0;
        int size = s.length();
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (lineCount == 0) {
                if (s.charAt(i) == '*') {
                    count++;
                    continue;
                }
            }
            if (s.charAt(i) == '|') {
                flag = !flag;
                lineCount++;
                if (lineCount % 2 == 0) {
                    int j = i + 1;
                    while (j < size && s.charAt(j) != '|') {
                        if (s.charAt(j) == '*')
                            count++;
                        j++;
                    }
                }
            }
        }
        return count;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/206875019-086c928c-0b0a-4ab6-a10e-e952f60e16b6.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/72e87617289c1cbe3cc73ae5066ea27da1cad1e2/Day35_Count_Asterisks/code.java)
