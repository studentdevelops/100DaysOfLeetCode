class Solution {
    public int maxProduct(int[] nums) {
        int product=0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int tempProduct = (nums[i] - 1) * (nums[j]-1);
                if(tempProduct > product){
                    product = tempProduct;
                }
            }
        }
        return product;
    }
}
