# Day 50 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You are given a string `num` representing a large integer. An integer is good if it meets the following conditions:

* It is a substring of `num` with length `3`.
* It consists of only one unique digit.
Return the maximum good integer as a string or an empty string `""` if no such integer exists.

Note:

* A substring is a contiguous sequence of characters within a string.
* There may be leading zeroes in num or a good integer.
 


#### LeetCode Link: [Largest 3-Same-Digit Number in String](https://leetcode.com/problems/largest-3-same-digit-number-in-string/description/)
___


### Test Cases
```
Input: num = "6777133339"
Output: "777"
Explanation: There are two distinct good integers: "777" and "333".
"777" is the largest, so we return "777".
```
```
Input: num = "2300019"
Output: "000"
Explanation: "000" is the only good integer.
```
```
Input: num = "42352338"
Output: ""
Explanation: No substring of length 3 consists of only one unique digit. Therefore, there are no good integers.
```
___

### Constraints 
* `3 <= num.length <= 1000`
* `num` only consists of digits.

```java
class Solution {
    public String largestGoodInteger(String num) {
        String bigger = "0";
        int toReduce = num.length() <= 3 ? 0 : 2;
        String number = "0";
        
        for (int i = 0; i < num.length() - toReduce; i++) {
            if ((i + 2) < num.length()) {
                if (num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2)) {
                    number = String.valueOf(num.charAt(i))
                            + String.valueOf(num.charAt(i+1))
                            + String.valueOf(num.charAt(i+2));
                }
            }
            if (Integer.parseInt(number) >= Integer.parseInt(bigger)) {
                bigger = number;
            }
        }
        if (bigger.length() == 1) {
            return "";
        }
        return bigger;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/213005880-cc866261-1e80-411f-a6cb-20e76b6c49b2.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/46f26ecd78776d50ded5cc375109de3a427901d0/Day63_Largest_3_Same_Digit_Number_in_String/code.java)
