# Day 2 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums. 
Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

#### LeetCode Link: [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
___

For this program a custom judge will test the solution
```java 
int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
```
If all assertions pass, then your solution will be accepted.
___

### Test Cases
```
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
```
```
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
```
___

### Constraints 
* `1 <= nums.length <= 3 * 104`  
* `-100 <= nums[i] <= 100`  
* `nums is sorted in non-decreasing order.`  
___

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
			return nums.length;
		}
		int currentCount = 0;
		for (int i = 0; i < nums.length - 1; i++) {
            System.out.println(i +" : " + (i+1));
			if (nums[i] != nums[i + 1]) {
				nums[currentCount] = nums[i];
                currentCount++;
			}
		}
		nums[currentCount] = nums[nums.length - 1];
		return currentCount + 1;
    }
}```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/200628543-0c5f8ad4-b179-4a88-9def-e5a5539df94a.png)
___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/main/Day2_RemoveDuplicates/code.java)
