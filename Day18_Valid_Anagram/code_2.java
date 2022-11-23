class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length() || s.length() == 0 || t.length() == 0)
            return false;

        char[] wordArray = s.toCharArray();
        char[] targetArray = t.toCharArray();
        
        for (int i = 0; i < wordArray.length; i++) {
            for (int j = 0; j < targetArray.length; j++) {
                if(wordArray[i] == targetArray[j]){
                    targetArray[j] = ' ';
                    break;
                }
            }
        }
        for (char c : targetArray) {
            if(c!=' ') return false;
        }
        return true;
    }
}
