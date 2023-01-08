# Day 56 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an array `arr`, replace every element in that array with the greatest element among the elements to its right, and replace the last element with `-1`.

After doing so, return the array.


#### LeetCode Link: [Replace Elements with Greatest Element on Right Side](https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/)
___


### Test Cases
```
Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
Explanation: 
- index 0 --> the greatest element to the right of index 0 is index 1 (18).
- index 1 --> the greatest element to the right of index 1 is index 4 (6).
- index 2 --> the greatest element to the right of index 2 is index 4 (6).
- index 3 --> the greatest element to the right of index 3 is index 4 (6).
- index 4 --> the greatest element to the right of index 4 is index 5 (1).
- index 5 --> there are no elements to the right of index 5, so we put -1.
```
```
Input: arr = [400]
Output: [-1]
Explanation: There are no elements to the right of index 0.
```
___

### Constraints 
* `1 <= arr.length <= 10^4`
* `1 <= arr[i] <= 10^5`

```java
class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            int num = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] > num){
                    num = arr[j];
                }
            }
            arr[i] = num;
        }
        return arr;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/211203573-36f17313-6efe-4b99-a772-2f8965845fe5.png)

___

### Link to Github file
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/31d7b55793bc1a7e1662fbaeb3df4227420cd28f/Day56_Replace_Element_with_Greatest_Element_on_Right_Side/code.java)
