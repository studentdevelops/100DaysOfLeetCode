class Solution {
    public String reverseOnlyLetters(String s) {
        char[] wordChar = new char[s.length()];
        int start = 0, end = s.length() - 1;
        while (start < wordChar.length && end > -1 ) {
            if(!((s.charAt(start) >='A' && s.charAt(start) <= 'Z') || 
            (s.charAt(start) >='a' && s.charAt(start) <= 'z'))){
                wordChar[start] = s.charAt(start);
                start++;
                continue;
            }
            if(!((s.charAt(end) >='A' && s.charAt(end) <= 'Z') || 
            (s.charAt(end) >='a' && s.charAt(end) <= 'z'))){
                wordChar[end] = s.charAt(end);
                end--;
                continue;
            }
            if((s.charAt(start) >='A' && s.charAt(start) <= 'Z') || 
            (s.charAt(start) >='a' && s.charAt(start) <= 'z')){
                wordChar[start] = s.charAt(end);
                wordChar[end] = s.charAt(start);
            }
            start++;
            end--;

        }
        return String.valueOf(wordChar);
    }
}
