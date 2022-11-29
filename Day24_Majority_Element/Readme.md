# Day 24 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.


#### LeetCode Link: [Majority Element](https://leetcode.com/problems/majority-element/description/)
___


### Test Cases
```
Input: nums = [3,2,3]
Output: 3
```
```
Input: nums = [2,2,1,1,1,2,2]
Output: 2
```
___

### Constraints 
* `n == nums.length`
* `1 <= n <= 5 * 10^4`
* `-10^9 <= nums[i] <= 10^9`

```java
class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        Arrays.sort(nums);
        int count = 1;
        int innercount = 1;
        int num = 0;
        for (int i = 1; i < nums.length; i++) {
            if(count > (nums.length/2) + 1) return num;
            if (nums[i] == nums[i - 1]) {
                innercount++;
            } else
                innercount = 1;

            if (innercount > count) {
                num = nums[i - 1];
                count = innercount;
            }
        }

        return num;
    }
}
```
___
### Results  
I decided to add multiple screenshot as i managed to half the run time every submit which i am pretty stocked even tho it wasnt on top 1% but still wanted to share this moment
![image](https://user-images.githubusercontent.com/31382363/204644023-5f9740f6-915e-4f51-be80-f8ff0cbf3201.png)
![image](https://user-images.githubusercontent.com/31382363/204644068-15137dca-c4e7-449a-8124-6c9097a1bdf4.png)
![image](https://user-images.githubusercontent.com/31382363/204644105-05c80108-e95f-4596-8cdb-25b2076e6cdf.png)
![image](https://user-images.githubusercontent.com/31382363/204644143-1275a98e-df93-41c8-81ea-e9750b762ac7.png)

___

### Link to Github file  
* [Java Final Submission](https://github.com/studentdevelops/100DaysOfLeetCode/blob/c2d105a4967a17ae829507e512dcc6a68923cfbe/Day24_Majority_Element/code.java)
* [Java Earlier Submission](https://github.com/studentdevelops/100DaysOfLeetCode/blob/c2d105a4967a17ae829507e512dcc6a68923cfbe/Day24_Majority_Element/code2.java)
