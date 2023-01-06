class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1 || nums.length == 0) {
            return;
        }
        int swaped = 0;
        for (int i = 0; i < nums.length - swaped; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                    
                }
                nums[nums.length - 1] = 0;
                swaped++;
                if(nums[i] == 0 ){
                    i--;
                }
            }
        }
    }
}
