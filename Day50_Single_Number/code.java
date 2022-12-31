class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> hmp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hmp.put(nums[i], hmp.getOrDefault(nums[i], 0) + 1);
        }
        for (int i : nums) {
            if(hmp.get(i) == 1){
                return i;
            }
        }
        return 0;
    }
}
