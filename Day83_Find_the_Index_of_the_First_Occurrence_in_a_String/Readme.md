# Day 83 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given two strings `needle` and `haystack`, return the index of the first occurrence of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

#### LeetCode Link: [Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=study-plan-v2&envId=programming-skills)
___


### Test Cases
```
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
```
```
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
```
___

### Constraints 
* `1 <= haystack.length, needle.length <= 10^4`
* `haystack` and `needle` consist of only lowercase English characters.

```java
class Solution {
    public int strStr(String haystack, String needle) {
        int curIndex = 0;
        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        if (needleArr.length > haystackArr.length) {
            return -1;
        }
        ArrayList<Integer> Indices = new ArrayList<Integer>();
        for (int i = 0; i < haystackArr.length; i++) {
            if (haystackArr[i] == needleArr[curIndex]) {
                Indices.add(i);
            }
        }
        for (int i = 0; i < Indices.size(); i++) {
            for (int j = Indices.get(i); j < (j + needleArr.length) && curIndex < needleArr.length
                    && j < haystackArr.length; j++) {
                if (haystackArr[j] == needleArr[curIndex]) {
                    curIndex++;
                } else {
                    break;
                }
            }
            if (curIndex == needleArr.length) {
                return Indices.get(i);
            }
            curIndex = 0;
        }
        return -1;
    }
}
```
___
### Results
![image](https://github.com/studentdevelops/100DaysOfLeetCode/assets/31382363/15be242e-7f0d-4107-b2f3-d6e2e2b7dbae)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/67c37534ff480608b07fffbe2023a0f5ce6b245e/Day64_Maximum_Ascending_Subarray_Sum/code.java)
