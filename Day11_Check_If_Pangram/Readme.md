# Day 11 of `#100DaysOfLeetCode`

___
### Problem Statement:  
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.


#### LeetCode Link: [Check if the Sentence Is Pangram](https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/)
___


### Test Cases
```
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
```
```
Input: sentence = "leetcode"
Output: false
```
___

### Constraints 
* `1 <= sentence.length <= 1000`
* `sentence` consists of lowercase English letters.

```java
class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<sentence.length();i++){
            if(hm.size() == 26) break;
            hm.put(sentence.charAt(i),0);
        }
        if(hm.size()==26){
            return true;
        }
        return false;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/202283384-82f920cf-f4ef-4ce0-9833-0239859888eb.png)

___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/f16a35551b9f702d4c46e8c75548293d93e5ddf1/Day11_Check_If_Pangram/code.java)
