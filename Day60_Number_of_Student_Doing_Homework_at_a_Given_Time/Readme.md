# Day 60 of `#100DaysOfLeetCode`

___
### Problem Statement:  
Given two integer arrays `startTime` and `endTime` and given an integer `queryTime`.

The `i`th student started doing their homework at the time `startTime[i]` and finished it at time `endTime[i]`.

Return the number of students doing their homework at time `queryTime`. More formally, return the number of students where `queryTime` lays in the interval `[startTime[i]`, `endTime[i]]` inclusive.

#### LeetCode Link: [Number of Students Doing Homework at a Given Time](https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/description/)
___


### Test Cases
```
Input: startTime = [1,2,3], endTime = [3,2,7], queryTime = 4
Output: 1
Explanation: We have 3 students where:
The first student started doing homework at time 1 and finished at time 3 and wasn't doing anything at time 4.
The second student started doing homework at time 2 and finished at time 2 and also wasn't doing anything at time 4.
The third student started doing homework at time 3 and finished at time 7 and was the only student doing homework at time 4.
```
```
Input: startTime = [4], endTime = [4], queryTime = 4
Output: 1
Explanation: The only student was doing their homework at the queryTime.
```
___

### Constraints 
* `startTime.length == endTime.length`
* `1 <= startTime.length <= 100`
* `1 <= startTime[i] <= endTime[i] <= 1000`
* `1 <= queryTime <= 1000`

```java
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            int starttime = startTime[i]; 
            int endtime = endTime[i];
            if(starttime <= queryTime && queryTime <= endtime){
                count++;
            }

        }
        return count;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/212170799-34898bed-3df6-4ad4-8b8d-ff4417dbe5c4.png)



___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/efa92f786cfb93a648cae384a74c644f8f6c035d/Day60_Number_of_Student_Doing_Homework_at_a_Given_Time/code.java)
