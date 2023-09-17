class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int highestCount = -1;
        int curCount = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if(flag && nums[i] == 1){
                if(nums[i] == 1){
                    curCount++;
                }
            }
            else if(nums[i] == 1){
                flag = true;
                curCount++;
            } else {
                curCount = 0;
                flag = false;
            }

            if(curCount > highestCount){
                highestCount = curCount;
            }
        }
        return highestCount;
    }
}
