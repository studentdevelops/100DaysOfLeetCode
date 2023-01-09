class Solution {
    public String removeDuplicates(String s) {
       StringBuilder newS = new StringBuilder(s);
        for (int i = 0; i < newS.length()-1; i++) {
            if(newS.charAt(i) != newS.charAt(i+1)) continue;
            if(newS.charAt(i) == newS.charAt(i+1)){
                newS.delete(i, i+2);
                i = i==0?i-1:i-2;
            }
        }
        return newS.toString();
    }
}
