class Solution {
    public String restoreString(String s, int[] indices) {
        char[] charArray = s.toCharArray();
        char[] charArray2 = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            charArray2[indices[i]] = charArray[i];
        }
        return String.valueOf(charArray2);
    }
}
