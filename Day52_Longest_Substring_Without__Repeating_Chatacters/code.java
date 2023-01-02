class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size = s.length();
        String chars = "";
        int length = 0;
        for (int i = 0; i < size; i++) {
            if (i == 0)
                length = 1;
            if (chars.length() > length) {
                length = chars.length();
            }
            if (!chars.contains(Character.toString(s.charAt(i)))) {
                chars = chars + s.charAt(i);
            }
            else {
                chars = chars.substring(1, chars.length());
                i--;
            }
        }
        if (chars.length() > length) {
            length = chars.length();
        }
        return length;
    }
}
