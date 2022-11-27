# Day 22 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

#### LeetCode Link: [Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/description/)
___


### Test Cases
```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
```
```
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
```
___

### Constraints 
* `1 <= nums1.length, nums2.length <= 1000`
* `0 <= nums1[i], nums2[i] <= 1000`

```java
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]){
                    if(!numbers.contains(nums1[i]))
                        numbers.add(nums1[i]);
                }
            }
        }
        int[] numArray = numbers.stream().mapToInt(i -> i).toArray();
        return numArray;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/204159923-1dcf0969-8b01-4d09-b7ed-02bc106a5ce8.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/bdf946adb75fa2ec1e719731bf10b0e1b012906a/Day22_Intersection_of_Arrays/code.java)
