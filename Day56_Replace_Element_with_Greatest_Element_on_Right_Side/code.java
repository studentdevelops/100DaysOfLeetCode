class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            int num = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] > num){
                    num = arr[j];
                }
            }
            arr[i] = num;
        }
        return arr;
    }
}
