class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1Length = word1.length();
        int w2Length = word2.length();
        String newWord = "";
        int k = 0;
        int j = 0;
        for (int i = 0; i < w1Length + w2Length; i++) {
            if (k < w1Length) {
                if (i % 2 == 0) {
                    newWord = newWord + word1.charAt(k);
                    k++;
                }
            } else if (k >= w1Length && j < w2Length) {
                newWord = newWord + word2.charAt(j);
                j++;
            }

            if (j < w2Length) {
                if (i % 2 != 0) {
                    newWord = newWord + word2.charAt(j);
                    j++;
                }
            } else if (j >= w2Length && k < w1Length) {
                newWord = newWord + word1.charAt(k);
                k++;
            }
        }
        return newWord;
    }
}
