class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1)
            return true;
        int size = String.valueOf(num).length();
        size *= size;
        for (int i = 2; i <= num / size; i++) {
            if (num % i != 0)
                continue;
            if (num % i == 0) {
                if (i * i == num) {
                    return true;
                }
            }
        }
        return false;
    }
}
