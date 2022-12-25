# Day 45 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an integer `num`, return a string representing its hexadecimal representation. For negative integers, [two’s complement](https://en.wikipedia.org/wiki/Two%27s_complement) method is used.

All the letters in the answer string should be lowercase characters, and there should not be any leading zeros in the answer except for the zero itself.

Note: You are not allowed to use any built-in library method to directly solve this problem.

#### LeetCode Link: [Convert a Number to Hexadecimal](https://leetcode.com/problems/convert-a-number-to-hexadecimal/description/)
___


### Test Cases
```
Input: num = 26
Output: "1a"
```
```
Input: num = -1
Output: "ffffffff"
```
___

### Constraints 
* `-2^31 <= num <= 2^31 - 1`

```java
class Solution {
    public String helper(int val) {
        String hex = "";
        switch (val) {
            case 10:
                hex = "a" + hex;
                break;
            case 11:
                hex = "b" + hex;
                break;
            case 12:
                hex = "c" + hex;
                break;
            case 13:
                hex = "d" + hex;
                break;
            case 14:
                hex = "e" + hex;
                break;
            case 15:
                hex = "f" + hex;
                break;
            default:
                hex = val + hex;
        }
        return hex;
    }
    public String toHex(int num) {
        if (num == 0 ) return "0";
        String hex = "";
        if (num > 0) {
            while (num != 0) {
                int remainder = num % 16;
                hex = helper(remainder) + hex;
                num /= 16;
            }
        } else {
            char[] binary = Integer.toBinaryString(num).toCharArray();
            for (int i = 0; i < binary.length; i += 4) {
                int hexa = ((binary[i] - '0') * 8) + ((binary[i + 1] - '0') * 4) + ((binary[i + 2] - '0') * 2)
                        + (binary[i + 3] - '0');
                hex = hex + helper(hexa) ;
            }
        }
        return hex;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/209479596-5e426d88-ae5c-4b40-84cb-3166434da909.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/be9fc005b0eb6a444ffb3d2f6b06bb1274847226/Day45_Convert_To_Hexadecimal/code.java)
