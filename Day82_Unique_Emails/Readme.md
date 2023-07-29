# Day 82 of `#100DaysOfLeetCode`

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
* `1 <= emails.length <= 100`
* `1 <= emails[i].length <= 100`
* `emails[i]` consist of lowercase English letters, `'+'`, `'.'` and `'@'`.
* Each `emails[i]` contains exactly one `'@'` character.
* All local and domain names are non-empty.
* Local names do not start with a `'+'` character.
* Domain names end with the `".com"` suffix.

```java
class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> cnt=new LinkedHashSet<>();
        int index=0;
        for(String email:emails)
        {
            String arr[]=email.split("@");
           index=arr[0].indexOf("+");
                if(index>0)
            arr[0]=arr[0].substring(0,index);
            arr[0]=arr[0].replaceAll("\\.","");
            cnt.add(arr[0]+"@"+arr[1]);
            
        }
        return cnt.size();
    }
}
```
___
### Results
![image](https://github.com/studentdevelops/100DaysOfLeetCode/assets/31382363/6cf2d81f-3e65-477e-9ff3-2ef61ade6279)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/21cbbff93aedc3a1f42f7a1e9de06fbcb3e716a8/Day82_Unique_Emails/code.java)
