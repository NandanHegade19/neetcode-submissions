class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int num : nums) {
            queue.offer(num);
        }

        for (int i = 0; i < k-1; i++){
            queue.poll();
        }

        if(!queue.isEmpty()) {
            return queue.poll();
        }else return 0;
    }
}
