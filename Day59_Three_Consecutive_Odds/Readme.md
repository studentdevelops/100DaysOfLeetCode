# Day 59 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an integer array arr, return `true` if there are three consecutive odd numbers in the array. Otherwise, return `false`.

#### LeetCode Link: [Three Consecutive Odds](https://leetcode.com/problems/three-consecutive-odds/description/)
___


### Test Cases
```
Input: arr = [2,6,4,1]
Output: false
Explanation: There are no three consecutive odds.
```
```
Input: arr = [1,2,34,3,4,5,7,23,12]
Output: true
Explanation: [5,7,23] are three consecutive odds.
```
___

### Constraints 
* `1 <= arr.length <= 1000`
* `1 <= arr[i] <= 1000`

```java
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0 && flag == true){
                flag = true;
                count++;
            } else if(arr[i]%2!=0){
                flag = true;
                count++;
            } else {
                flag = false;
                count = 0;
            }
            if(count==3){
                return true;
            }
        }
        return false;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/211650211-47d7b5c3-195d-4e9b-9674-061a6b925f28.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/959b2affd87edd85b6eb58b5acd2f3e559ab9212/Day59_Three_Consecutive_Odds/code.java)
