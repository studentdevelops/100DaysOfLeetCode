# Day 89 of `#100DaysOfLeetCode`

___
### Problem Statement:  
There is a function `signFunc(x)` that returns:

* `1` if `x` is positive.
* `-1` if `x` is negative.
* `0` if `x` is equal to `0`.
You are given an integer array `nums`. Let product be the product of all values in the array `nums`.

Return signFunc(product).


#### LeetCode Link: [Sign of the Product of an Array](https://leetcode.com/problems/sign-of-the-product-of-an-array/?envType=study-plan-v2&envId=programming-skills)
___


### Test Cases
```
Input: nums = [-1,-2,-3,-4,3,2,1]
Output: 1
Explanation: The product of all values in the array is 144, and signFunc(144) = 1
```
```
Input: nums = [1,5,0,2,-3]
Output: 0
Explanation: The product of all values in the array is 0, and signFunc(0) = 0
```
```
Input: nums = [-1,1,-1,1,-1]
Output: -1
Explanation: The product of all values in the array is -1, and signFunc(-1) = -1
```
___

### Constraints 
* `1 <= nums.length <= 1000`
* `-100 <= nums[i] <= 100`

___
```java
class Solution {
    public int arraySign(int[] nums) {
        int negetives = 0;
        for (int i : nums) {
            if (i == 0) {
                return 0;
            }
            if (i < 0) {
                negetives++;
            }
        }
        return negetives % 2 == 0 ? 1 : -1;
    }
}
```
___
### Results
![image](https://github.com/studentdevelops/100DaysOfLeetCode/assets/31382363/ee169e3f-70aa-4cbb-a345-a453dbbcfb9a)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/074645ce5208af9f54182f10f4f84be5900d3401/Day88_Sign_of_the_Product_of_an_Array/code.java)
