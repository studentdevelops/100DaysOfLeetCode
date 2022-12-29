class Solution {
    public int heightChecker(int[] heights) {
        int[] original = heights.clone();
        Arrays.sort(original);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != original[i]) count++ ;
        }
        return count;
    }
}
