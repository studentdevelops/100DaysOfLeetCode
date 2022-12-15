# Day 39 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
![image](https://user-images.githubusercontent.com/31382363/207941823-77215243-6ff6-4d5a-84a6-9b03d1c45c90.png)


#### LeetCode Link: [Transpose Matrix](https://leetcode.com/problems/transpose-matrix/description/)
___


### Test Cases
```
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
```
```
Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
```
___

### Constraints 
* `m == matrix.length`
* `n == matrix[i].length`
* `1 <= m, n <= 1000`
* `1 <= m * n <= 10^5`
* `-10^9 <= matrix[i][j] <= 10^9`

```java
class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] TransposeMatrix = new int [matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                TransposeMatrix[j][i] = matrix[i][j];
            }            
        }
        return TransposeMatrix;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/207941682-52eaefc4-0cf3-4389-8c75-863f97f18f1f.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/2cf95241ddf019540ba3e2d0d6ba150041d3ad2d/Day40_Transpose_Matrix/code.java)
