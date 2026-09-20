class Solution {
    public int search(int[] nums, int target) {
        int lp = 0;
        int rp = nums.length-1;

        while(lp < rp){
            int mid = (lp+rp)/2;
            if(nums[mid] > nums[rp]){
                lp = mid+1;
            }else{
                rp = mid;
            }
        }
        int pivot = lp;
         int result = binarySearch(nums, target, 0, pivot - 1);
        if (result != -1) {
            return result;
        }

        return binarySearch(nums, target, pivot, nums.length - 1);
    }
    public int binarySearch(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
