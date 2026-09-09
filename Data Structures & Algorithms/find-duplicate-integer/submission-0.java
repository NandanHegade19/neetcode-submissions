class Solution {
    public int findDuplicate(int[] nums) {
        
        Arrays.sort(nums);

        int p1 = nums[0];
        int p2 = nums[1];

        for(int i = 1; i < nums.length; i++){
            if(p1 == p2) return p1;
            p1 = nums[i];
            p2 = nums[i+1];
        }
        return 0;
    }
}
