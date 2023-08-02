# Day 84 of `#100DaysOfLeetCode`

___
### Problem Statement:  
A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.

Given an array of numbers `arr`, return `true` if the array can be rearranged to form an arithmetic progression. Otherwise, return `false`.

#### LeetCode Link: [Can Make Arithmetic Progression From Sequence](https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/description/?envType=study-plan-v2&envId=programming-skills)
___


### Test Cases
```
Input: arr = [3,5,1]
Output: true
Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.
```
```
Input: arr = [1,2,4]
Output: false
Explanation: There is no way to reorder the elements to obtain an arithmetic progression.
```
___

### Constraints 
* `2 <= arr.length <= 1000`
* `-10^6 <= arr[i] <= 10^6`

___
```java
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length <= 2) {
            return true;
        }
        Arrays.sort(arr);
        boolean flag = true;
        int difference = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) != difference) {
                flag = false;
            }
        }
        return flag;
    }
}
```
___
### Results
![image](https://github.com/studentdevelops/100DaysOfLeetCode/assets/31382363/a72b9154-4429-4fbb-9d22-3f47953b2ac0)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/93d54611582c18180b6fd670599be9b29b3a8e33/Day84_Arithmetic_Progression_from_Sequence/code.java)
