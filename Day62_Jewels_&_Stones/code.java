class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char[] jewelArray = jewels.toCharArray();
        char[] stonesArray = stones.toCharArray();
        for (char c : jewelArray) {
            for (char d : stonesArray) {
                if(c==d){
                    count++;
                }
            }
        }
        return count;
    }
}
