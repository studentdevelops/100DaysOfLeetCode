# Day 92 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Implement `pow(x, n)`, which calculates `x` raised to the power `n` (i.e., `xn`).

#### LeetCode Link: [Pow(x, n)](https://leetcode.com/problems/powx-n/description/?envType=study-plan-v2&envId=programming-skills)
___


### Test Cases
```
Input: x = 2.00000, n = 10
Output: 1024.00000
```
```
Input: x = 2.10000, n = 3
Output: 9.26100
```
```
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
```
___

### Constraints 
* `-100.0 < x < 100.0`
* `-2^31 <= n <= 2^31-1`
* `n` is an integer.
* Either `x` is not zero or `n > 0`.
* `-10^4 <= xn <= 10^4`

```java
class Solution {
    public double myPow(double x, int n) {
        double ans =  1.0;
        long num = n;
        if(num<0) num = num * -1;
        while(num>0) {
            if(num%2==1) {
                ans = ans * x;
                num--;
            } else {
                x = x * x;
                num =  num/2;
            }
        }
        if(n<0) ans = (double)(1.0) / (double)(ans);
        return ans;
    }
}
```
___
### Results
![image](https://github.com/studentdevelops/100DaysOfLeetCode/assets/31382363/84890dee-6c8e-46db-9b86-8a0a6ec5c321)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/043e0d1d04a5248a8c225b69319f2eb651d9e297/Day92_Pow(x%2Cy)/code.java)
