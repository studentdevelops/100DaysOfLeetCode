# Day 13 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an integer n, return a string array answer (1-indexed) where:

* `answer[i]` == `"FizzBuzz"` if i is divisible by `3` and `5`.
* `answer[i]` == `"Fizz"` if i is divisible by `3`.
* `answer[i]` == `"Buzz"` if i is divisible by `5`.
* `answer[i]` == `i` (as a string) if none of the above conditions are true.


#### LeetCode Link: [FizzBuzz](https://leetcode.com/problems/fizz-buzz/description/)
___


### Test Cases
```
Input: n = 3
Output: ["1","2","Fizz"]
```
```
Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
```
```
Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
```
___

### Constraints 
* `1 <= n <= 104`

```java
import java.util.ArrayList;
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            } else if(i%3==0){
                list.add("Fizz");
            } else if(i%5==0){
                list.add("Buzz");
            } else list.add(String.valueOf(i));
        }
        return list;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/202791624-9e4d087e-108d-4631-92e5-a6239cb27860.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/d26f3a8edc0d1a17274ceb0192f69bf2ee12e067/Day12_Find_The_Difference/code.java)
