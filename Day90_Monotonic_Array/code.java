class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        boolean flag = false;
        if (nums[0] <= nums[1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if ((nums[i] <= nums[i + 1])) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            return flag;
        }
        if (nums[0] >= nums[1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if ((nums[i] >= nums[i + 1])) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
