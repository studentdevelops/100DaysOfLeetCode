class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j = n;
        int k = 0;
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[k];
            i++;
            newNums[i] = nums[j];
            k++;
            j++;
        }
        return newNums;
    }
}
