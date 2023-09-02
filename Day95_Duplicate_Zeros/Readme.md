# Day 30 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a fixed-length integer array `arr`, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

#### LeetCode Link: [Duplicate Zeros](https://leetcode.com/problems/duplicate-zeros/description/)
___


### Test Cases
```
Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
```
```
Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]
```
___

### Constraints 
* `1 <= arr.length <= 10^4`
* `0 <= arr[i] <= 9`

```java
class Solution {
    public void duplicateZeros(int[] arr) {
        int curRemainder = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                int temp = -1;
                for (int j = i + 1; j < arr.length - 1; j++) {
                    if (temp == -1) {
                        temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        continue;
                    }
                    int temp2 = arr[j + 1];
                    arr[j + 1] = temp;
                    temp = temp2;
                }
                arr[i+1] = 0;
                i++;
            }
        }
    }
}
```
___
### Results
![image](https://github.com/studentdevelops/100DaysOfLeetCode/assets/31382363/f4fdd387-d107-4940-9d50-32e2fa57f423)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/416ad6e47b3ae908acc2d65bb2036a5e9420f007/Day30_Number_Of_Segments/code.java)
