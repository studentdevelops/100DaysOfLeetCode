# Day 1 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.  
Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.  
Return k after placing the final result in the first k slots of nums.  
Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
___

For this program a custom judge will test the solution
```java 
int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
```
If all assertions pass, then your solution will be accepted.
___

### Test Cases
```
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:
```
```
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
```
___

### Constraints 
* `0 <= nums.length <= 100`  
* `0 <= nums[i] <= 50`  
* `0 <= val <= 100`  
___

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 1) {
            if (nums[0] == val) {
                return 0;
            } else
                return 1;
        }
        int count = 0;
        for (int i = 0; i < nums.length - count; i++) {
            if (nums[i] == val ) {
                count++;
                int temp = nums[i];
                for (int j = i; j < nums.length; j++) {
                    if (j != nums.length - 1)
                        nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = temp;
                if(nums[i] == val && i!= nums.length - 1) 
                    i--;
            }
        }
        return nums.length - count;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/200379057-77760859-8645-4ae2-b79c-257caf5545ad.png)
___



