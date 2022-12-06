class Solution {
    public String thousandSeparator(int n) {
        String number = String.valueOf(n);
        n = number.length();
        if (n == 0 || n == 1 || n == 2 || n == 3)
            return number;
        String newNumber = "";
        int counter = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (counter % 3 == 0 && counter != n) {
                number = number.substring(0, i) + "." + number.substring(i, number.length());
            }
            if (!newNumber.isEmpty()) {
                number = newNumber;
                newNumber = "";
            }
            counter++;
        }
        return number;
    }
}
