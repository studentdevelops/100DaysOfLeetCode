# Day 26 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You are given a string `s` and an integer array `indices` of the same length. The string `s` will be shuffled such that the character at the ith position moves to `indices[i]` in the shuffled string.

Return the shuffled string.

Example:


![image](https://user-images.githubusercontent.com/31382363/205143185-a8839406-e627-4205-9657-131e356eb436.png)


#### LeetCode Link: [Shuffle String](https://leetcode.com/problems/shuffle-string/description/)
___


### Test Cases
```
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
```
```
Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.
```
___

### Constraints 
* `s.length == indices.length == n`
* `1 <= n <= 100`
* `s` consists of only lowercase English letters.
* `0 <= indices[i] < n`
* All values of indices are unique.

```java
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] charArray = s.toCharArray();
        char[] charArray2 = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            charArray2[indices[i]] = charArray[i];
        }
        return String.valueOf(charArray2);
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/205142594-72016119-b949-476b-93bc-085d40ccf0c3.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/c8f8ed1477ad7ab96a0b4982e1c4a41bf411c5b7/Day26_Shuffle_String/code.java)
