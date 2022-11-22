class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String SentenceList[] = sentence.split(" ");
        int size = searchWord.length();
        for (int i = 0; i < SentenceList.length; i++) {
            if (SentenceList[i].length() >= size) {
                if (SentenceList[i].substring(0, size).equals(searchWord))
                    return (i + 1);
            }

        }
        return -1;
    }
}
