# Day 87 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given two non-negative integers `low` and `high`. Return the count of odd numbers between `low` and `high` (inclusive).


#### LeetCode Link: [Count Odd Numbers in an Interval Range](https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/description/?envType=study-plan-v2&envId=programming-skills)
___


### Test Cases
```
Input: low = 3, high = 7
Output: 3
Explanation: The odd numbers between 3 and 7 are [3,5,7].
```
```
Input: low = 8, high = 10
Output: 1
Explanation: The odd numbers between 8 and 10 are [9].
```
___

### Constraints 
* `0 <= low <= high <= 10^9`

___
```java
class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        for(int i=low; i<=high;i++){
            if(i%2!=0){
                count++;
                i++;
            }
        }
        return count;
    }
}
```
___
### Results
![image](https://github.com/studentdevelops/100DaysOfLeetCode/assets/31382363/d8357f2c-7dce-4492-b50e-142d9e27d747)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/dc69744fbb1b4af3d120b003c9bb19d9d25d3f04/Day86_Matrix_Diagonal_Sum/code.java)
