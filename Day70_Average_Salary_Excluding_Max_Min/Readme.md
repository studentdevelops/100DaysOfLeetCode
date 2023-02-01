# Day 70 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You are given an array of unique integers `salary` where `salary[i]` is the salary of the `i`th employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within `10^(-5)` of the actual answer will be accepted.


#### LeetCode Link: [Average Salary Excluding the Minimum and Maximum Salary](https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/)
___


### Test Cases
```
Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
```
```
Input: salary = [1000,2000,3000]
Output: 2000.00000
Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000) / 1 = 2000
```
___

### Constraints 
* `3 <= salary.length <= 100`
* `1000 <= salary[i] <= 10^6`
* All the integers of `salary` are unique.

```java
class Solution {
    public double average(int[] salary) {
        double max = salary[0], min = salary[salary.length - 1];
        for (int i = 0; i < salary.length; i++) {
            if(salary[i] > max){
                max = salary[i];
            } else if(salary[i] < min){
                min = salary[i];
            }
        }
        double avg = 0;
        for (int i = 0; i < salary.length; i++) {
            if(!(salary[i] == max || salary[i] == min)){
                avg = avg + salary[i];
            }
        }
        return avg/(salary.length - 2);
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/216148069-ac55f033-2e11-4194-9fcf-56197a5ec646.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/deeff8240cd2b6bf53d04c6125abf0c5b2fc76a9/Day70_Average_Salary_Excluding_Max_Min/code.java)
