class Solution {
    public char findTheDifference(String s, String t) {
        char[] charArray1 = s.toCharArray();
        Arrays.sort(charArray1);
        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray2);

        int i = 0, j = 0;
        while (i< charArray1.length && j < charArray2.length) {
            if (charArray1[i] != charArray2[j]) {
                return charArray2[j];
            } else {
                i++;
                j++;
            }
        }
        return charArray2[charArray2.length - 1];
    }
}
