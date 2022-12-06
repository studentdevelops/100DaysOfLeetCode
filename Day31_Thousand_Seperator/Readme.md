# Day 31 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an integer `n`, add a dot (".") as the thousands separator and return it in string format.


#### LeetCode Link: [Thousand Separator](https://leetcode.com/problems/thousand-separator/description/)
___


### Test Cases
```
Input: n = 987
Output: "987"
```
```
Input: n = 1234
Output: "1.234"
```
___

### Constraints 
* `0 <= n <= 2^31 - 1`

```java
class Solution {
    public String thousandSeparator(int n) {
        String number = String.valueOf(n);
        n = number.length();
        if (n == 0 || n == 1 || n == 2 || n == 3)
            return number;
        String newNumber = "";
        int counter = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (counter % 3 == 0 && counter != n) {
                for (int j = 0; j < number.length(); j++) {
                    if (j == i) {
                        newNumber = newNumber + ".";
                    }
                    newNumber = newNumber + String.valueOf(number.charAt(j));
                }
            }
            if (!newNumber.isEmpty()) {
                number = newNumber;
                newNumber = "";
            }
            counter++;
        }
        return number;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/206014234-a861206b-dc87-4731-b704-e95feac033d5.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/2aff75ed96972c51a22c583df85af730859fc5c3/Day31_Thousand_Seperator/code.java)
