class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        List<Integer>[] bucket = new List[nums.length+1];
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num: nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        for(int key : freq.keySet()){
            int fre = freq.get(key);
            if(bucket[fre] == null){
                bucket[fre] = new ArrayList<>();
            }
            bucket[fre].add(key);
        }

        int[] res = new int[k];
        int counter = 0;
        for(int i = bucket.length-1; i >=0 && counter < k; i--){
            if(bucket[i] != null){
                for(int val : bucket[i]){
                    res[counter++] = val;
                }
            }
        }
        return res;
    }
}
