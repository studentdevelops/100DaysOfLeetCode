import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
 
        for (int t : nums) {
            set.add(t);
        }
        
        return !(set.size() == nums.length);
    }
}
