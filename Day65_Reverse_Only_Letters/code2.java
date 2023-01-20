class Solution {
    public String reverseOnlyLetters(String s) {
        String pattern = "^[a-zA-Z]";
        char[] wordChar = new char[s.length()];
        int start = 0, end = s.length()-1;
        while(start < wordChar.length && end > -1 ){
            if(!String.valueOf(s.charAt(start)).matches(pattern)){
                wordChar[start]= s.charAt(start);
                start++;
                continue;
            }
            if(!String.valueOf(s.charAt(end)).matches(pattern)){
                wordChar[end]= s.charAt(end);
                end--;
                continue;
            }
            if(String.valueOf(s.charAt(start)).matches(pattern)){
                wordChar[start] = s.charAt(end);
                wordChar[end] = s.charAt(start);
            }
            start++;
            end--;
        }
        return String.valueOf(wordChar);
    }
}
