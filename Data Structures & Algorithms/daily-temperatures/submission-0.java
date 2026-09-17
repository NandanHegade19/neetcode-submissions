class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int len = temperatures.length;
        int[] results = new int[len];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = len -1; i >= 0; i--){
            while(!stack.isEmpty() && temperatures[i] >= 
            temperatures[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                results[i] = stack.peek() - i;
            }

            stack.push(i);
        }
        return results;
    }
}
