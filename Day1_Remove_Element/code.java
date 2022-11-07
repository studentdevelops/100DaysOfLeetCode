class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 1) {
            if (nums[0] == val) {
                return 0;
            } else
                return 1;
        }
        int count = 0;
        for (int i = 0; i < nums.length - count; i++) {
            if (nums[i] == val ) {
                count++;
                int temp = nums[i];
                for (int j = i; j < nums.length; j++) {
                    if (j != nums.length - 1)
                        nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = temp;
                if(nums[i] == val && i!= nums.length - 1) 
                    i--;
            }
        }
        return nums.length - count;
    }
}
