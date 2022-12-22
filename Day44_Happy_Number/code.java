class Solution {
    public int helper(int n) {
        int sum = 0;
        while (n != 0) {
            int remainder = (n % 10) * (n % 10);
            sum += remainder;
            n = n / 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        if (n == 1)
            return true;
        while (n > 6) {
            n = helper(n);
        }
        if (n == 1)
            return true;
        return false;
    }
}
