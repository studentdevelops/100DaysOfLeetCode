class Solution {
    public String reversePrefix(String word, char ch) {
        String fString = "";
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ch){
                fString = fString + word.charAt(i);
                for (int j = i-1; j >= 0; j--) {
                    fString = fString + word.charAt(j);
                }
                fString = fString + word.substring(i + 1, word.length());
                break;
            }
        }
        return fString.length() == 0 ? word : fString;
    }
}
