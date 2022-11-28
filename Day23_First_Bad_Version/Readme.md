# Day 23 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.


#### LeetCode Link: [First Bad Version](https://leetcode.com/problems/first-bad-version/description/)
___


### Test Cases
```
Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.
```
```
Input: n = 1, bad = 1
Output: 1
```
___

### Constraints 
* `1 <= bad <= n <= 2^31 - 1`

```java
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int version = 0;
        while (start <= end) {
			int mid = start + (end - start) / 2;
			if (isBadVersion(mid)) {
				version = mid;
                end = mid - 1;
			} else
				start = mid + 1;
		}
        return version ;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/204374533-ee786d7e-5452-4d11-a777-146b101da084.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/8f7c4fc230806fddb57ef29e1f16fe66c47380c1/Day23_First_Bad_Version/code.java)
