class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftSum = new int[nums.length], rightSum = new int[nums.length];
        int i = 0, j = nums.length - 1;
        int sumOfLeft = 0, sumOfRight = 0;
        while (i < leftSum.length ) {
            sumOfLeft = sumOfLeft + nums[i];
            leftSum[i] = sumOfLeft;
            sumOfRight = sumOfRight + nums[j];
            rightSum[j] = sumOfRight;
            i++;
            j--;
        }
        for (int k = 0; k < leftSum.length; k++) {
            if(leftSum[k] == rightSum[k]){
                return k;
            }
        }
        return -1;
    }
}
