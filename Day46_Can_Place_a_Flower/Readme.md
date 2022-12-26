# Day 46 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array `flowerbed` containing `0`'s and `1`'s, where `0` means empty and `1` means not empty, and an integer `n`, return if `n` new flowers can be planted in the `flowerbed` without violating the no-adjacent-flowers rule.

#### LeetCode Link: [Can Place Flowers](https://leetcode.com/problems/can-place-flowers/description/)
___


### Test Cases
```
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
```
```
Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
```
___

### Constraints 
* `1 <= flowerbed.length <= 2 * 10^4`
* `flowerbed[i]` is `0` or `1`.
* There are no two adjacent flowers in `flowerbed`.
* `0 <= n <= flowerbed.length`

```java
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if((flowerbed.length == 1 && flowerbed[0] == 0) || n==0 ) return true;
        if(flowerbed.length == 1 && flowerbed[0] == 1 ) return false;
        int i = 0;
        int count = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0) {
                if (i == 0 && flowerbed[i + 1] == 0) {
                    i++;
                    count++;
                } else if(i== flowerbed.length - 1 && flowerbed[i-1]==0) {
                    i++;
                    count++;
                }else if (flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0) {
                    i++;
                    count++;
                }
            }
            if (i < flowerbed.length) {
                if (flowerbed[i] == 1) {
                    i++;
                }
            }
            i++;
            if (count >= n)
                return true;
        }
        return false;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/209578149-de7f5ded-bf90-4735-9386-ade55dfcfb4d.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/cedd81aeebd01b373a2dd9d9b6614fc86a573ea6/Day46_Can_Place_a_Flower/code.java)
