# Day 68 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given the array `nums` consisting of `2n` elements in the form `[x1,x2,...,xn,y1,y2,...,yn]`.

Return the array in the form `[x1,y1,x2,y2,...,xn,yn]`.

#### LeetCode Link: [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/description/)
___


### Test Cases
```
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
```
```
Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]
```
```
Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]
```
___

### Constraints 
* `1 <= n <= 500`.
* `nums.length == 2n`
* `1 <= nums[i] <= 10^3`.

```java
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j = n;
        int k = 0;
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[k];
            i++;
            newNums[i] = nums[j];
            k++;
            j++;
        }
        return newNums;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/214377840-ff50d757-dd8f-48f3-9f09-3bc32f2b6fe4.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/4fcbf5ba3c97f5d5934f24da8ef3203305386175/Day68_Shuffle_the_Array/code.java)
