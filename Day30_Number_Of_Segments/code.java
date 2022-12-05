class Solution {
    public int countSegments(String s) {
        s = s.trim();
        String[] aStrings = s.split(" ");
        int size = s.length();
        if (size == 0) {
            return 0;
        }
        int count = 1;
        for (int i = 1; i < size - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') {
                count++;
            }
        }
        return count;
    }
}
