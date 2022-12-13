class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] numsNew = new int[2* nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsNew[i] = nums[i];
            numsNew[i+nums.length] = nums[i];
        }
        return numsNew;
    }
}
