# Day 49 of `#100DaysOfLeetCode`

___
### Problem Statement:  
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence `"This is a sentence"` can be shuffled as `"sentence4 a3 is2 This1"` or `"is2 sentence4 This1 a3"`.
Given a shuffled sentence `s` containing no more than `9` words, reconstruct and return the original sentence.

#### LeetCode Link: [Sorting the Sentence](https://leetcode.com/problems/sorting-the-sentence/description/)
___


### Test Cases
```
Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
```
```
Input: s = "Myself2 Me1 I4 and3"
Output: "Me Myself and I"
Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
```
___

### Constraints 
* `2 <= s.length <= 200`
* `s` consists of lowercase and uppercase English letters, spaces, and digits from `1` to `9`
* The number of words in `s` is between `1` and `9`.
* The words in `s` are separated by a single space.
* `s` contains no leading or trailing spaces.

```java
class Solution {
    public String sortSentence(String s) {
       String senString = "";
        String[] senStrings = s.split(" ");
        int count = 1;
        int i = 0;
        while (i < senStrings.length) {
            if (senStrings[i].contains(String.valueOf(count))) {
                if (count < senStrings.length ) {
                    senString = senString + senStrings[i] + " ";
                } else {
                    senString = senString + senStrings[i];
                }
                count++;
            }
            i++;
            if (i == senStrings.length) {
                if (count != senStrings.length + 1) {
                    i = 0;
                }
            }
        }
        return senString.replaceAll("[0-9]", "");
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/210069279-70fde5b4-5453-469f-8fde-b1213902ad58.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/b14b0e54958975f94e93e4c9ce7bd6c49678cf55/Day49_Sorting_The_String/code.java)
