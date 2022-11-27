class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]){
                    if(!numbers.contains(nums1[i]))
                        numbers.add(nums1[i]);
                        break;
                }
            }
        }
        int[] numArray = numbers.stream().mapToInt(i -> i).toArray();
        return numArray;
    }
}
