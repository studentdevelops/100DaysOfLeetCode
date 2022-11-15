class Solution {
    public Boolean isVowel(char sh) {
        char[] ch = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        for (char c : ch) {
            if (sh == c) {
                return true;
            }
        }
        return false;
    }

    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int size = s.length();
        int endChar = size - 1;
        int startChar = 0;
        while( startChar < endChar){
            if(!isVowel(charArray[startChar])){
                startChar++;
                continue;
            }

            if(!isVowel(charArray[endChar])){
                endChar--;
                continue;
            }

            char temp = charArray[startChar];
            charArray[startChar] = charArray[endChar];
            charArray[endChar] = temp;
            startChar++;
            endChar--;
        }

        return new String(charArray);
    }
}
