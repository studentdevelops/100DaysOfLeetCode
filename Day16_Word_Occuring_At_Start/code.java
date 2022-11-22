class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String SentenceList[] = sentence.split(" ");
        for (int i = 0; i < SentenceList.length; i++) {
            if(SentenceList[i].startsWith(searchWord, 0)){
                return i+1;
            }
        }
        return -1;
    }
}
