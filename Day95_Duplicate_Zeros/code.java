class Solution {
    public void duplicateZeros(int[] arr) {
        int curRemainder = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                int temp = -1;
                for (int j = i + 1; j < arr.length - 1; j++) {
                    if (temp == -1) {
                        temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        continue;
                    }
                    int temp2 = arr[j + 1];
                    arr[j + 1] = temp;
                    temp = temp2;
                }
                arr[i+1] = 0;
                i++;
            }
        }
    }
}
