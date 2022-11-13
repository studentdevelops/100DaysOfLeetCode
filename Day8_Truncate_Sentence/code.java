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
