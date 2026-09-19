class Solution {
    public int search(int[] nums, int target) {

        int lp = 0;
        int rp = nums.length-1;
        
        while(lp <= rp){
            int mid = lp + (rp-lp)/2;
            if (target > nums[mid]){
                lp = mid+1;
            } else if (target < nums[mid]) {
                rp = mid-1;
            } else
                return mid;
        }
        return -1;
    }
}
