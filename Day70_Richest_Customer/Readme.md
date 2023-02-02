# Day 70 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You are given an `m x n` integer grid `accounts` where `accounts[i][j]` is the amount of money the `i`th customer has in the `j`th bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

 


#### LeetCode Link: [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/description/)
___


### Test Cases
```
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
```
```
Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
```
```
Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
Output: 17
```
___

### Constraints 
* `m == accounts.length`
* `n == accounts[i].length`
* `1 <= m, n <= 50`
* `1 <= accounts[i][j] <= 100`

```java
class Solution {
    public int maximumWealth(int[][] accounts) {
        int count = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            if(sum > count){
                count = sum;
            }
        }
        return count;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/216438460-f6b547f6-fb63-4b72-bd24-bef6656c1659.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/994495a10dfea332087d4a8d0735c96a6a77afb4/Day70_Richest_Customer/code.java)
