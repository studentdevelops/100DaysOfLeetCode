class Solution {
    public String toLowerCase(String s) {
        char[] UpperCaseArray = s.toLowerCase().toCharArray();
        char[] biggerArray = s.toCharArray();
        for (int i = 0; i < biggerArray.length; i++) {
            if(biggerArray[i] == UpperCaseArray[i]) continue;
            biggerArray[i] =  (char) (biggerArray[i] + 32);
        }
        
        return new String(biggerArray);
    }
}
