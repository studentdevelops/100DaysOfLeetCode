# Day 76 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given two non-negative integers, `num1` and `num2` represented as string, return the sum of `num1` and `num2` as a string.

You must solve the problem without using any built-in library for handling large integers (such as `BigInteger`). You must also not convert the inputs to integers directly.

#### LeetCode Link: [Add Strings](https://leetcode.com/problems/add-strings/description/)
___


### Test Cases
```
Input: num1 = "11", num2 = "123"
Output: "134"
```
```
Input: num1 = "456", num2 = "77"
Output: "533"
```
```
Input: num1 = "0", num2 = "0"
Output: "0"
```
___


### Constraints 
* `1 <= num1.length, num2.length <= 10^4`
* `num1` and `num2` consist of only digits.
* `num1` and `num2` don't have any leading zeros except for the zero itself.


___
```java
import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger i=new BigInteger(num1);
        BigInteger j=new BigInteger(num2);
        BigInteger x =i.add(j);
        String s = x.toString(); 
        return s;
    }
}
```


___
### Results
![image](https://user-images.githubusercontent.com/31382363/221022149-f23e5531-5890-4b09-89f9-1d297268f4e7.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/c942c7b42eb861f1b25ac66d99e2e1007a5b280b/Day79_Add_Strings/code.java)
