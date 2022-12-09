# Day 10 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with `O(log n)` runtime complexity.


#### LeetCode Link: [Search Insert Position](https://leetcode.com/problems/search-insert-position/description/)
___


### Test Cases
```
Input: nums = [1,3,5,6], target = 5
Output: 2
```
```
Input: nums = [1,3,5,6], target = 2
Output: 1
```
```
Input: nums = [1,3,5,6], target = 7
Output: 4
```
___

### Constraints 
* `1 <= nums.length <= 10^4`
* `-10^4 <= nums[i] <= 10^4`
* `nums` contains distinct values sorted in ascending order.
* `-10^4 <= target <= 10^4`

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
            int mid = end + ( start - end) / 2;
            if(nums[mid] == target)
                return mid;
            
            if(target > nums[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return start;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/206795102-4b5c927f-3490-47c5-9ff5-305b51abb201.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/6071c09131459b10e75ae4aa52cdc17f59415515/Day34_Search_Insert_Position/code.java)
