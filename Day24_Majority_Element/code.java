class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        Arrays.sort(nums);
        int count = 1;
        int innercount = 1;
        int num = 0;
        for (int i = 1; i < nums.length; i++) {
            if(count > (nums.length/2) + 1) return num;
            if (nums[i] == nums[i - 1]) {
                innercount++;
            } else
                innercount = 1;

            if (innercount > count) {
                num = nums[i - 1];
                count = innercount;
            }
        }

        return num;
    }
}
