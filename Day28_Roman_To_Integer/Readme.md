# Day 28 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Roman numerals are represented by seven different symbols: `I`, `V`, `X`, `L`, `C`, `D` and `M`.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, `2` is written as `II` in Roman numeral, just two ones added together. `12` is written as `XII`, which is simply `X` + `II`. The number `27` is written as `XXVII`, which is `XX` + `V` + `II`.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for `four` is not `IIII`. Instead, the number four is written as `IV`. Because the `one` is before the `five` we subtract it making `four`. The same principle applies to the number `nine`, which is written as `IX`. There are `six` instances where subtraction is used:

`I` can be placed before `V` (5) and `X` (10) to make `4` and `9`. 
`X` can be placed before `L` (50) and `C` (100) to make `40` and `90`. 
`C` can be placed before `D` (500) and `M` (1000) to make `400` and `900`.
Given a roman numeral, convert it to an integer.

#### LeetCode Link: [Roman to Integer](https://leetcode.com/problems/roman-to-integer/description/)
___


### Test Cases
```
Input: s = "III"
Output: 3
Explanation: III = 3.
```
```
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
```
```
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
```
___

### Constraints 
* `1 <= s.length <= 15`
* `s` contains only the characters `('I', 'V', 'X', 'L', 'C', 'D', 'M')`
* It is guaranteed that `s` is a valid roman numeral in the range `[1, 3999]`.

```java
class Solution {
    public int romanToInt(String s) {
        int converted = 0;
        StringBuilder sb = new StringBuilder(s);
        for(int i=s.length() - 1; i>=0 ; i--){
            if(s.charAt(i)=='I'){
                converted = converted + 1;
            }
            else if(s.charAt(i) == 'V'){
                if( i!=0 && s.charAt(i - 1)=='I') {
                    converted = converted - 1;
                    i--;
                }
                converted = converted + 5;
            }
            else if(s.charAt(i) == 'X'){
                if(i!=0 && s.charAt(i - 1)=='I') {
                    converted = converted - 1;
                    i--;
                }
                converted = converted + 10;
            }
            else if(s.charAt(i) == 'L'){
                if(i!=0 && s.charAt(i - 1)=='X') {
                    converted = converted - 10;
                    i--;
                }
                converted = converted + 50;
            }
            else if(s.charAt(i) == 'C'){
                if(i!=0 && s.charAt(i - 1)=='X') {
                    converted = converted - 10;
                    i--;
                }
                converted = converted + 100;
            }
            else if(s.charAt(i)== 'D'){
                if(i!=0 && s.charAt(i - 1)=='C') {
                    converted = converted - 100;
                    i--;
                }
                converted = converted + 500;
            }            
            else if(s.charAt(i) == 'M'){
                if(i!=0 && s.charAt(i - 1)=='C') {
                    converted = converted - 100;
                    i--;
                }
                converted = converted + 1000;
            }
        }
        return converted;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/205508419-031ca52f-905c-43a6-8e1e-2fa91e168231.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/c28852142f7f13424a7ddaff9b0f44dc125e3994/Day28_Roman_To_Integer/code.java)
