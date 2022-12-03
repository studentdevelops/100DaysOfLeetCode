
class Solution {
    public int search(int[] nums, int target) {
        int index = -1;
		int start = 0;
		int end = nums.length - 1;
        if(nums.length == 0) return index;
		while (start <= end ) {
			int mid = (start + end) / 2;
			if(nums[mid] == target){
				index = mid;
				break;
			}
			else if(nums[mid] > target){
				end = mid - 1;
			}
			else if(nums[mid]< target){
				start = mid + 1;
			}
		}
        return index;
    }
}
