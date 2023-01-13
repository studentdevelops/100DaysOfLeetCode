import java.util.Collections;
import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int mostFrequentEven(int[] nums) {
        if(nums.length == 0 ) return -1;
        if(nums.length == 1) if(nums.length == 0 ) return nums[0]%2==0? nums[0] : -1;
        Arrays.sort(nums);
        int count = 0;
        int highest = -1;
        for (int i = 0; i < nums.length - count; i++) {
            if (nums[i] % 2 == 0) {
                int innerCount = 1;
                int j = i + 1;
                while (j < nums.length ) {
                    if(nums[i] == nums[j]){
                        innerCount++;
                    }
                    j++;
                }
                if (innerCount > count) {
                    count = innerCount;
                    highest = nums[i];
                }

            }
        }
        return highest;
        
    }
}
