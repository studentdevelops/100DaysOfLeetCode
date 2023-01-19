class Solution {
    public int maxAscendingSum(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int last_digit = nums[0];
        int sum = nums[0], last_sum = 0;
        for (int i = 1; i < nums.length; i++) {
            if (last_digit == nums[i]) {
                last_digit = nums[i];
                if(sum > last_sum){
                    last_sum = sum;
                }
                sum = nums[i];
                continue;
            }
            if (nums[i] >= last_digit) {
                sum = sum + nums[i];
                last_digit = nums[i];
            }

            if (nums[i] < last_digit) {
                last_digit = nums[i];
                if (sum > last_sum) {
                    last_sum = sum;
                }
                sum = nums[i];
            }
        }
        if (last_sum < sum)
            return sum;
        return last_sum;
    }
}
