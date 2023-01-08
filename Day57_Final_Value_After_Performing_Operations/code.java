class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int number = 0;
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].contains("++")){
                number++;
            } else {
                number--;
            }
        }
        return number;
    }
}
