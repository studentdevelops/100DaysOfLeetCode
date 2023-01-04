# Day 54 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an array arr of integers, check if there exist two indices `i` and `j` such that :

* `i != j`
* `0 <= i, j < arr.length`
* `arr[i] == 2 * arr[j]`
 


#### LeetCode Link: [Check If N and Its Double Exist](https://leetcode.com/problems/check-if-n-and-its-double-exist/description/)
___


### Test Cases
```
Input: arr = [10,2,5,3]
Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
```
```
Input: arr = [3,1,7,11]
Output: false
Explanation: There is no i and j that satisfy the conditions.
```
___

### Constraints 
* `2 <= arr.length <= 500`
* `-10^3 <= arr[i] <= 10^3`

___
```java
class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0 ; j < arr.length; j++) {
                if(i == j){
                    continue;
                }
                if(arr[j] * 2 == arr[i]){
                    return true;
                }
            }
        }
        return false;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/210640791-f8f9fb1b-653d-4db7-b77e-d63fcd6a6e70.png)



___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/5bd4045d320693b0fe516a35d531e55bd7617fdc/Day54_Check_If_N_and_Its_Double_Exists/code.java)
