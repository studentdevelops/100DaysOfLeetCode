# Day 91 of `#100DaysOfLeetCode`

___
### Problem Statement:  
You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.

You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:

* An integer x.
  * Record a new score of x.
* '+'.
  * Record a new score that is the sum of the previous two scores.
* 'D'.
  * Record a new score that is the double of the previous score.
* 'C'.
  * Invalidate the previous score, removing it from the record.
Return the sum of all the scores on the record after applying all the operations.

The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.

 

#### LeetCode Link: [Baseball Game](https://leetcode.com/problems/baseball-game/description/?envType=study-plan-v2&envId=programming-skills)
___


### Test Cases
```
Input: ops = ["5","2","C","D","+"]
Output: 30
Explanation:
"5" - Add 5 to the record, record is now [5].
"2" - Add 2 to the record, record is now [5, 2].
"C" - Invalidate and remove the previous score, record is now [5].
"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
The total sum is 5 + 10 + 15 = 30.
```
```
Input: ops = ["5","-2","4","C","D","9","+","+"]
Output: 27
Explanation:
"5" - Add 5 to the record, record is now [5].
"-2" - Add -2 to the record, record is now [5, -2].
"4" - Add 4 to the record, record is now [5, -2, 4].
"C" - Invalidate and remove the previous score, record is now [5, -2].
"D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
"9" - Add 9 to the record, record is now [5, -2, -4, 9].
"+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
"+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.
```
```
Input: ops = ["1","C"]
Output: 0
Explanation:
"1" - Add 1 to the record, record is now [1].
"C" - Invalidate and remove the previous score, record is now [].
Since the record is empty, the total sum is 0.
```
___

### Constraints 
* `1 <= operations.length <= 1000`
* `operations[i] is "C", "D", "+", or a string representing an integer in the range [-3 * 10^4, 3 * 10^4].`
* For operation `"+"`, there will always be at least two previous scores on the record.
* For operations `"C"` and `"D"`, there will always be at least one previous score on the record.

```java
class Solution {
    public boolean checkOps(String op) {
        String[] ops = { "+", "D", "C" };
        for (String string : ops) {
            if (string.equals(op)) {
                return true;
            }
        }
        return false;
    }
    public int calPoints(String[] operations) {
        ArrayList<String> list = new ArrayList<>();
        for (String item : operations) {
            if (!checkOps(item)) {
                list.add(item);
            } else {
                if (item.equals("+")) {
                        int val = Integer.parseInt(list.get(list.size() - 1))
                                + Integer.parseInt((list.get(list.size() - 2)));
                        list.add(String.valueOf(val));
                } else if (item.equals("D")) {
                    list.add(String.valueOf(Integer.parseInt(list.get(list.size() - 1)) * 2));
                } else if(item.equals("C")) {
                    list.remove(list.size() - 1);
                }
            }
        }
        int count = 0;
        for (String string : list) {
            count = count + Integer.parseInt(string);
        }
        return count;
    }
}
```
___
### Results
![image](https://github.com/studentdevelops/100DaysOfLeetCode/assets/31382363/5ca4a07d-2ac3-4334-a1c8-a3430a2b63c7)


___

### Link to Github file
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/8e7fde0b361394bc858ba1433c2e14ea6cfbc2c5/Day91_Baseball_Game/code.java)
