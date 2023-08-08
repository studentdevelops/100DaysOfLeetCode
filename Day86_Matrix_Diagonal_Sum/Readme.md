# Day 86 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a square matrix `mat`, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

#### LeetCode Link: [Matrix Diagonal Sum](https://leetcode.com/problems/matrix-diagonal-sum/description/?envType=study-plan-v2&envId=programming-skills)
___


### Test Cases
![image](https://github.com/studentdevelops/100DaysOfLeetCode/assets/31382363/374dd7f5-ff13-40f8-90ed-ba86404256fc)
```
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
```
```
Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8
```
```
Input: mat = [[5]]
Output: 5
```
___

### Constraints 
* `n == mat.length == mat[i].length`
* `1 <= n <= 100`
* `1 <= mat[i][j] <= 100`

___
```java
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = mat.length - 1; j >= 0; j--) {
                if (i == j) {
                    sum += mat[i][j];
                } else if ((i + j) == mat.length - 1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
```
___
### Results
![image](https://github.com/studentdevelops/100DaysOfLeetCode/assets/31382363/1313de7a-d153-43fd-9e8b-a25d54e71333)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/e274165291de2b1678f4509dc746e4b8d53d9931/Day85_Repeated_SubString_Pattern/code.java)
