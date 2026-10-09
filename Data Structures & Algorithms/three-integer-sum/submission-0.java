class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++){
            
            int lp = i+1;
            int rp = nums.length-1;

            while(lp < rp){
                int sum = nums[i] + nums[lp] + nums[rp];
                if(sum == 0){
                    set.add(Arrays.asList(nums[i], nums[lp], nums[rp]));
                    rp--;
                    lp++;
                }else if(sum > 0){
                    rp--;
                }else{
                    lp++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
