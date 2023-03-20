# Day 81 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You are given a string `num`, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of `num`, or an empty string `""` if no odd integer exists.

A substring is a contiguous sequence of characters within a string.

#### LeetCode Link: [Largest Odd Number in String](https://leetcode.com/problems/largest-odd-number-in-string/description/)
___


### Test Cases
```
Input: num = "52"
Output: "5"
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
```
```
Input: num = "4206"
Output: ""
Explanation: There are no odd numbers in "4206".
```
```
Input: num = "35427"
Output: "35427"
Explanation: "35427" is already an odd number.
```
___

### Constraints 
* `1 <= num.length <= 10^5`
* `num` only consists of digits and does not contain any leading zeros.

```java
class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/226433835-8f2f5de4-ae34-4783-89db-dec91b870344.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/d4d16dc3f66da0cdca86979d46b4c6a6468cd450/Day81_Largest_Odd_Number_in_String/code.java)
