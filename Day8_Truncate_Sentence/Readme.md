# Day 8 of `#100DaysOfLeetCode`

___
### Problem Statement:  
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).

For example, `"Hello World"`, `"HELLO"`, and `"hello world hello world"` are all sentences.
You are given a sentence `s` and an integer `k`. You want to truncate `s` such that it contains only the first `k` words. Return `s` after truncating it.

#### LeetCode Link: [Truncate Sentence](https://leetcode.com/problems/truncate-sentence/description/)
___


### Test Cases
```
Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
Explanation:
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".
```
```
Input: s = "What is the solution to this problem", k = 4
Output: "What is the solution"
Explanation:
The words in s are ["What", "is" "the", "solution", "to", "this", "problem"].
The first 4 words are ["What", "is", "the", "solution"].
Hence, you should return "What is the solution".
```
```
Input: s = "chopper is not a tanuki", k = 5
Output: "chopper is not a tanuki"
```
___

### Constraints 
* `1 <= s.length <= 500`
* `k is in the range [1, the number of words in s].`
* `s consist of only lowercase and uppercase English letters and spaces.`
* `The words in s are separated by a single space.`
* `There are no leading or trailing spaces.`
___

```java
class Solution {
    public String truncateSentence(String s, int k) {
        String[] sentence = s.split(" ");
        String newSentence = "";
        if(sentence.length < k || k==0 ){
            return s;
        }
        for (int i = 0; i < k; i++) {
            newSentence = newSentence + sentence[i]; 
            if(i!=k-1){
                newSentence = newSentence + " ";
            }
        }
        return newSentence;
    }
}
```
___
### Results
![image](https://user-images.githubusercontent.com/31382363/201542772-ee909153-c691-4c3e-827b-0c257f3cb998.png)


___

### Link to Github file  
* [Java](https://github.com/studentdevelops/100DaysOfLeetCode/blob/5af85933fff79b87ebe66b17483e4e3f60b74c9f/Day8_Truncate_Sentence/code.java)
