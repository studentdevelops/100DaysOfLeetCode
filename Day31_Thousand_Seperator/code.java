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
                for (int j = 0; j < number.length(); j++) {
                    if (j == i) {
                        newNumber = newNumber + ".";
                    }
                    newNumber = newNumber + String.valueOf(number.charAt(j));
                }
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
