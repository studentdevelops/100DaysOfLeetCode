class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0 && flag == true){
                flag = true;
                count++;
            } else if(arr[i]%2!=0){
                flag = true;
                count++;
            } else {
                flag = false;
                count = 0;
            }
            if(count==3){
                return true;
            }
        }
        return false;
    }
}
