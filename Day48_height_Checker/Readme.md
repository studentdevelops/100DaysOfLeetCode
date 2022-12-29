# Day 48 of `#100DaysOfLeetCode`

___
### Problem Statement:  
A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array `expected` where `expected[i]` is the expected height of the `i`th student in line.

You are given an integer array `heights` representing the current order that the students are standing in. Each `heights[i]` is the height of the `i`th student in line (0-indexed).

Return the number of indices where `heights[i] != expected[i]`.

#### LeetCode Link: [Height Checker](https://leetcode.com/problems/height-checker/)
___


### Test Cases
```
Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation: 
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.
```
```
Input: heights = [5,1,2,3,4]
Output: 5
Explanation:
heights:  [5,1,2,3,4]
expected: [1,2,3,4,5]
All indices do not match.
```
```
Input: heights = [1,2,3,4,5]
Output: 0
Explanation:
heights:  [1,2,3,4,5]
expected: [1,2,3,4,5]
All indices match.
```
___

### Constraints 
* `1 <= sentence.length <= 100`
* `1 <= searchWord.length <= 10`
* `sentence` consists of lowercase English letters and spaces.
* `searchWord` consists of lowercase English letters.

```java
class Solution {
    public int heightChecker(int[] heights) {
        int[] original = heights.clone();
        Arrays.sort(original);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != original[i]) count++ ;
        }
        return count;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/209988399-da72325c-c069-4729-aad4-3d8c87b71370.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/6b898341263c818106fb132ef915b279042c55c5/Day48_height_Checker/code.java)
