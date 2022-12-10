class Solution {
    public int countAsterisks(String s) {
        int lineCount = 0;
        int size = s.length();
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (lineCount == 0) {
                if (s.charAt(i) == '*') {
                    count++;
                    continue;
                }
            }
            if (s.charAt(i) == '|') {
                flag = !flag;
                lineCount++;
                if (lineCount % 2 == 0) {
                    int j = i + 1;
                    while (j < size && s.charAt(j) != '|') {
                        if (s.charAt(j) == '*')
                            count++;
                        j++;
                    }
                }
            }
        }
        return count;
    }
}
