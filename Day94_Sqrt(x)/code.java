class Solution {
    public int mySqrt(int x) {
        int count = 0;
        int n = x, i = 1;
        while (n != 0 && !(n<0)) {
            n -= i;
            if(n<0){
                count--;
            }
            count++;
            i += 2;
        }
        return count;
    }
}
