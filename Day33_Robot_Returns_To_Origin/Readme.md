# Day 33 of `#100DaysOfLeetCode`

___
### Problem Statement:  
There is a robot starting at the position `(0, 0)`, the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at `(0, 0)` after it completes its moves.

You are given a string moves that represents the move sequence of the robot where `moves[i]` represents its ith move. Valid moves are `'R'` (right), `'L'` (left), `'U'` (up), and `'D'` (down).

Return `true` if the robot returns to the origin after it finishes all of its moves, or `false` otherwise.

Note: The way that the robot is "facing" is irrelevant. `'R'` will always make the robot move to the right once, `'L'` will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.


#### LeetCode Link: [Robot Return to Origin](https://leetcode.com/problems/robot-return-to-origin/description/)
___


### Test Cases
```
Input: moves = "UD"
Output: true
Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.
```
```
Input: moves = "LL"
Output: false
Explanation: The robot moves left twice. It ends up two "moves" to the left of the origin. We return false because it is not at the origin at the end of its moves.
```
___

### Constraints 
* `1 <= moves.length <= 2 * 10^4`
* `moves` only contains the characters `'U'`, `'D'`, `'L'` and `'R'`.

```java
class Solution {
    public boolean judgeCircle(String moves) {
        char[] MoveArray = moves.toLowerCase().toCharArray();
        HashMap<String, Integer> moveMap = new HashMap<String, Integer>();
        moveMap.put("vertical", 0);
        moveMap.put("horizontal", 0);
        for (int i = 0; i < MoveArray.length; i++) {
            if (MoveArray[i] == 'u') {
                moveMap.put("vertical", moveMap.get("vertical") + 1);
            } else if (MoveArray[i] == 'd') {
                moveMap.put("vertical", moveMap.get("vertical") - 1);
            } else if (MoveArray[i] == 'l') {
                moveMap.put("horizontal", moveMap.get("horizontal") + 1);
            } else if (MoveArray[i] == 'r') {
                moveMap.put("horizontal", moveMap.get("horizontal") - 1);
            }
        }

        for (int val : moveMap.values()) {
            if (val != 0)
                return false;
        }
        return true;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/206550446-45bd79be-cacb-419e-9ce0-1dc52c97c92c.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/bb3e6a139d16e1941161056f8b77db85d714d5bf/Day33_Robot_Returns_To_Origin/code.java)
