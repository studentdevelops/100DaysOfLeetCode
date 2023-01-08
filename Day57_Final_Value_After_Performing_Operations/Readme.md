# Day 57 of `#100DaysOfLeetCode`

___
### Problem Statement:  
There is a programming language with only four operations and one variable `X`:

* `++X` and `X++` increments the value of the variable `X` by `1`.
* `--X` and `X--` decrements the value of the variable `X` by `1`.
Initially, the value of `X` is `0`.

Given an array of strings `operations` containing a list of operations, return the final value of `X` after performing all the operations.


#### LeetCode Link: [Final Value of Variable After Performing Operations](https://leetcode.com/problems/final-value-of-variable-after-performing-operations/)
___


### Test Cases
```
Input: operations = ["--X","X++","X++"]
Output: 1
Explanation: The operations are performed as follows:
Initially, X = 0.
--X: X is decremented by 1, X =  0 - 1 = -1.
X++: X is incremented by 1, X = -1 + 1 =  0.
X++: X is incremented by 1, X =  0 + 1 =  1.
```
```
Input: operations = ["++X","++X","X++"]
Output: 3
Explanation: The operations are performed as follows:
Initially, X = 0.
++X: X is incremented by 1, X = 0 + 1 = 1.
++X: X is incremented by 1, X = 1 + 1 = 2.
X++: X is incremented by 1, X = 2 + 1 = 3.
```
```
Input: operations = ["X++","++X","--X","X--"]
Output: 0
Explanation: The operations are performed as follows:
Initially, X = 0.
X++: X is incremented by 1, X = 0 + 1 = 1.
++X: X is incremented by 1, X = 1 + 1 = 2.
--X: X is decremented by 1, X = 2 - 1 = 1.
X--: X is decremented by 1, X = 1 - 1 = 0.
```
___

### Constraints 
* `1 <= operations.length <= 100`
*  `operations[i]` will be either `"++X"`, `"X++"`, `"--X"`, or `"X--"`.

```java
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int number = 0;
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].contains("++")){
                number++;
            } else {
                number--;
            }
        }
        return number;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/211215441-e8d693ff-9c3e-497f-b5d0-b6d85db46508.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/34899c40ee45f6c3a0c63c427183aaef222df91a/Day57_Final_Value_After_Performing_Operations/code.java)
