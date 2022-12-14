# Day 39 of `#100DaysOfLeetCode`

___
### Problem Statement:  
We are playing the Guess Game. The game is as follows:

I pick a number from `1` to `n`. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API `int guess(int num)`, which returns three possible results:

- `-1`: Your guess is higher than the number I picked (i.e. `num > pick`).
- `1`: Your guess is lower than the number I picked (i.e. `num < pick`).
- `0`: your guess is equal to the number I picked (i.e. `num == pick`).


#### LeetCode Link: [Guess Number Higher or Lower](https://leetcode.com/problems/guess-number-higher-or-lower/description/)
___


### Test Cases
```
Input: n = 10, pick = 6
Output: 6
```
```
Input: n = 1, pick = 1
Output: 1
```
```
Input: n = 2, pick = 1
Output: 1
```
___

### Constraints 
* `1 <= n <= 2^31 - 1`
* `1 <= pick <= n`

```java
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            int guessNum = guess(mid);
            if(guessNum == -1){
                end = mid - 1;
            } else if(guessNum == 1) {
                start = mid + 1;
            } else return mid;
        }
        return end;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/207703158-2031e1ae-0995-4563-b822-ade3f5987b2d.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/bb724028554889649497d1b4756d640811fe8d4c/Day39_Guess_Number_Higher_Or_Lower/code.java)
