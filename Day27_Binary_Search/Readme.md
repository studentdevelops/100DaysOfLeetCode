# Day 27 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.


#### LeetCode Link: [Binary Search](https://leetcode.com/problems/binary-search/description/)
___


### Test Cases
```
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
```
```
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
```
___

### Constraints 
* `1 <= nums.length <= 10^4`
* `-10^4 < nums[i], target < 10^4`
* All the integers in nums are unique.
* `nums` is sorted in ascending order.

```java

class Solution {
    public int search(int[] nums, int target) {
        int index = -1;
		int start = 0;
		int end = nums.length - 1;
        if(nums.length == 0) return index;
		while (start <= end ) {
			int mid = (start + end) / 2;
			if(nums[mid] == target){
				index = mid;
				break;
			}
			else if(nums[mid] > target){
				end = mid - 1;
			}
			else if(nums[mid]< target){
				start = mid + 1;
			}
		}
        return index;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/205441953-28edc4f3-21d0-4fdf-949c-be4e76c2dac3.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/4119de3f07cf0e03dfba9f30444a217e2582e780/Day27_Binary_Search/code.java)
