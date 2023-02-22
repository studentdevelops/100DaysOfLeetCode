class Solution {
    public int[] separateDigits(int[] nums) {
        String stringNumbers = "";
        for (int i : nums) {
            stringNumbers += String.valueOf(i);
        }
        int[] numsArray = new int[stringNumbers.length()];
        for (int i = 0; i < numsArray.length; i++) {
            numsArray[i] = Integer.parseInt(String.valueOf(stringNumbers.charAt(i)));
        }
        return numsArray;
    }
}
