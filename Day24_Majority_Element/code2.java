class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int count = -1;
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count >= (nums.length/2) + 1) return num;
            if (i != 0 && num == nums[i])
                continue;
            int innerCount = 0;
            for (int j = i; j < nums.length; j++) {
                if (num == nums[j])
                    continue;
                if (nums[i] == nums[j]) {
                    innerCount++;
                }
            }
            if (innerCount > count) {
                count = innerCount;
                num = nums[i];
            }
        }
        return num;
    }
}
