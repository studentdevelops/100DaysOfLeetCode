class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;
        int count = 0;
        boolean flag = false;
        char[] letters = s.toCharArray();
        for (int i = 0; i < letters.length; i++) {

            if (absent >= 2 && late >= 3) {
                return false;
            }
            if (letters[i] == 'A') {
                flag = false;
                count = 0;
                absent++;
            } else if (flag && letters[i] == 'L') {
                late++;
                count++;
                if (count == 3) {
                    return false;
                }
            } else if (letters[i] == 'L') {
                late++;
                count = 1;
                flag = true;
            } else {
                flag = false;
                count = 0;
            }
        }
        // System.out.println(count);
        if (absent >= 2) {
            return false;
        }
        return true;
    }
}
