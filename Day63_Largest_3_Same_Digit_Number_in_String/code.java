class Solution {
    public String largestGoodInteger(String num) {
        String bigger = "0";
        int toReduce = num.length() <= 3 ? 0 : 2;
        String number = "0";
        
        for (int i = 0; i < num.length() - toReduce; i++) {
            if ((i + 2) < num.length()) {
                if (num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2)) {
                    number = String.valueOf(num.charAt(i))
                            + String.valueOf(num.charAt(i+1))
                            + String.valueOf(num.charAt(i+2));
                }
            }
            if (Integer.parseInt(number) >= Integer.parseInt(bigger)) {
                bigger = number;
            }
        }
        if (bigger.length() == 1) {
            return "";
        }
        return bigger;
    }
}
