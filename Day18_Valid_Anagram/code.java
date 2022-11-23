class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] sizeArr = new int[256];
        for (int i = 0; i < s.length(); i++) {
            sizeArr[s.charAt(i)]++;
            sizeArr[t.charAt(i)]--;
        }

        for (int i = 0; i < sizeArr.length; i++) {
            if(sizeArr[i] != 0 ) return false;
        }
        return true;
    }
}
