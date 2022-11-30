# Day 25 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You are given a string `s` representing an attendance record for a student where each character signifies whether the student was absent, late, or present on that day. The record only contains the following three characters:

`'A'`: Absent.
`'L'`: Late.
`'P'`: Present.
The student is eligible for an attendance award if they meet both of the following criteria:

The student was absent (`'A'`) for strictly fewer than 2 days total.
The student was never late (`'L'`) for 3 or more consecutive days.
Return `true` if the student is eligible for an attendance award, or `false` otherwise.


#### LeetCode Link: [Student Attendance Record I](https://leetcode.com/problems/student-attendance-record-i/description/)
___


### Test Cases
```
Input: s = "PPALLL"
Output: false
Explanation: The student was late 3 consecutive days in the last 3 days, so is not eligible for the award.
```
```
Input: s = "PPALLP"
Output: true
Explanation: The student has fewer than 2 absences and was never late 3 or more consecutive days.
```
___

### Constraints 
* `1 <= s.length <= 1000`
* `s[i]` is either `'A'`, `'L'`, or `'P'`

```java
class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;
        int count = 0;
        boolean flag = false;
        char[] letters = s.toCharArray();
        for (int i = 0; i < letters.length; i++) {

            if (absent >= 2 && late >= 3) {
                return false;
            }
            if (letters[i] == 'A') {
                flag = false;
                count = 0;
                absent++;
            } else if (flag && letters[i] == 'L') {
                late++;
                count++;
                if (count == 3) {
                    return false;
                }
            } else if (letters[i] == 'L') {
                late++;
                count = 1;
                flag = true;
            } else {
                flag = false;
                count = 0;
            }
        }
        // System.out.println(count);
        if (absent >= 2) {
            return false;
        }
        return true;
    }
}
```
___
### Results  
![image](https://user-images.githubusercontent.com/31382363/204895376-a7dc83a7-2268-40a0-b6f6-6a1ff5315e88.png)

___

### Link to Github file  
* [Java Final Submission](https://github.com/studentdevelops/100DaysOfLeetCode/blob/2b2181a93a1c510edefe42c1ff8d5a6e8dbb4a53/Day25_Student_Attendance/code.java)
