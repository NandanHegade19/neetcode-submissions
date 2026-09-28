class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        int[] indegree = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] pair : prerequisites){
            int course  = pair[0];
            int pre = pair[1];
            adj.get(course).add(pre);
            indegree[pre]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }
        int[] order = new int[numCourses];
        int completedCourses =0;
        while(!queue.isEmpty()){
            int node = queue.poll();
            order[numCourses - completedCourses - 1] = node;
            completedCourses++;
            for(int nei : adj.get(node)){
                indegree[nei]--;
                if(indegree[nei] == 0){
                    queue.add(nei);
                }
            }
        }
        if(completedCourses != numCourses){
            return new int[0];
        }
        return order;
    }
}
