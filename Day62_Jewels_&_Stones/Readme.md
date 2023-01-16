# Day 62 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You're given strings `jewels` representing the types of `stones` that are jewels, and `stones` representing the stones you have. Each character in `stones` is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so `"a"` is considered a different type of stone from `"A"`.

#### LeetCode Link: [Jewels and Stones](https://leetcode.com/problems/jewels-and-stones/description/)
___


### Test Cases
```
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
```
```
Input: jewels = "z", stones = "ZZ"
Output: 0
```
___

### Constraints 
* `1 <= jewels.length, stones.length <= 50`
* `jewels` and `stones` consist of only English letters.
* All the characters of `jewels` are unique.

```java
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char[] jewelArray = jewels.toCharArray();
        char[] stonesArray = stones.toCharArray();
        for (char c : jewelArray) {
            for (char d : stonesArray) {
                if(c==d){
                    count++;
                }
            }
        }
        return count;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/212748465-d3a7f219-ec4f-4ef8-80bb-d63525718bc0.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/bb3e6a139d16e1941161056f8b77db85d714d5bf/Day33_Robot_Returns_To_Origin/code.java)
