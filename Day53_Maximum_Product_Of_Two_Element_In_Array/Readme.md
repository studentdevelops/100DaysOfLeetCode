# Day 53 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given the array of integers `nums`, you will choose two different indices `i` and `j` of that array. Return the maximum value of `(nums[i]-1)*(nums[j]-1)`.


#### LeetCode Link: [Maximum Product of Two Elements in an Array](https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/)
___


### Test Cases
```
Input: nums = [3,4,5,2]
Output: 12 
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
```
```
Input: nums = [1,5,4,5]
Output: 16
Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
```
```
Input: nums = [3,7]
Output: 12
```
___

### Constraints 
* `2 <= nums.length <= 500`
* `1 <= nums[i] <= 10^3`

___
```java
class Solution {
    public int maxProduct(int[] nums) {
        int product = 0;
        Arrays.sort(nums);
        product = (nums[nums.length - 2] - 1) * (nums[nums.length - 1] - 1);
        return product;
    }
}
```
```java
class Solution {
    public int maxProduct(int[] nums) {
        int product=0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int tempProduct = (nums[i] - 1) * (nums[j]-1);
                if(tempProduct > product){
                    product = tempProduct;
                }
            }
        }
        return product;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/210524181-aa66e605-9a52-4894-91fa-510a49a52192.png)
![image](https://user-images.githubusercontent.com/31382363/210524229-a6593ed5-5fa4-47f7-b33b-5ca2a56b024a.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/c660d2e6f9b1f17bfcef1395a085bd258f0ecd66/Day53_Maximum_Product_Of_Two_Element_In_Array/code.java)
* [Alternate Java Code](https://github.com/studentdevelops/100DaysOfLeetCode/blob/c660d2e6f9b1f17bfcef1395a085bd258f0ecd66/Day53_Maximum_Product_Of_Two_Element_In_Array/code2.java)
