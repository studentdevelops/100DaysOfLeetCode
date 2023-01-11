class Solution {
    public int addDigits(int num) {
        while(num>=10){
            char[] charNum = String.valueOf(num).toCharArray();
            int newNum = 0;
            for (int i = 0; i < charNum.length; i++) {
                newNum = newNum + Integer.parseInt(String.valueOf(charNum[i]));
            }
            num = newNum;
        }
        return num;
    }
}
