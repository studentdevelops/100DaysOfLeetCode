class Solution {
    public int maxProduct(int[] nums) {
        int product = 0;
        Arrays.sort(nums);
        product = (nums[nums.length - 2] - 1) * (nums[nums.length - 1] - 1);
        return product;
    }
}
