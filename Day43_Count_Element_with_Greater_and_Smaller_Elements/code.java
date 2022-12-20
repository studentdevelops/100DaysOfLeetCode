class Solution {
    public int countElements(int[] nums) {
        int count = 0;
        for (int i : nums) {
            int lesserCount = 0;
            int greaterCount = 0;
            for (int j : nums) {
                if (i > j && lesserCount <= 1) {
                    lesserCount++;
                }
                if (i < j && greaterCount <= 1) {
                    greaterCount++;
                }
                if (lesserCount >= 1 && greaterCount >= 1) {
                    break;
                }
            }
            if (lesserCount>= 1 && greaterCount >= 1) {
                count++;
            }
        }
        return count;
    }
}
