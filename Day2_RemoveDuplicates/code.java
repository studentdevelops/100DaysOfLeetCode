class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
			return nums.length;
		}
		int currentCount = 0;
		for (int i = 0; i < nums.length - 1; i++) {
            System.out.println(i +" : " + (i+1));
			if (nums[i] != nums[i + 1]) {
				nums[currentCount] = nums[i];
                currentCount++;
			}
		}
		nums[currentCount] = nums[nums.length - 1];
		return currentCount + 1;
    }
}
