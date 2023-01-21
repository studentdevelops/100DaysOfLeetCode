# Day 65 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an array of integers `nums`, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is `0` because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return `-1`.

#### LeetCode Link: [Find Pivot Index](https://leetcode.com/problems/find-pivot-index/description/)
___


### Test Cases
```
Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
```
```
Input: nums = [1,2,3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.
```
```
Input: nums = [2,1,-1]
Output: 0
Explanation:
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0
```
___

### Constraints 
* `1 <= nums.length <= 10^4`.
* `-1000 <= nums[i] <= 1000`.

```java
class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftSum = new int[nums.length], rightSum = new int[nums.length];
        int i = 0, j = nums.length - 1;
        int sumOfLeft = 0, sumOfRight = 0;
        while (i < leftSum.length ) {
            sumOfLeft = sumOfLeft + nums[i];
            leftSum[i] = sumOfLeft;
            sumOfRight = sumOfRight + nums[j];
            rightSum[j] = sumOfRight;
            i++;
            j--;
        }
        for (int k = 0; k < leftSum.length; k++) {
            if(leftSum[k] == rightSum[k]){
                return k;
            }
        }
        return -1;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/213884345-2415763b-024c-4719-90d6-34318abb0398.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/70567197da43779471bcd68f545527fc81474209/Day66_Find_Pivot_Index/code.java)
