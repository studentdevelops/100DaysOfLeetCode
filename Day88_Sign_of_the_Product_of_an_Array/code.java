class Solution {
    public int arraySign(int[] nums) {
        int negetives = 0;
        for (int i : nums) {
            if (i == 0) {
                return 0;
            }
            if (i < 0) {
                negetives++;
            }
        }
        return negetives % 2 == 0 ? 1 : -1;
    }
}
