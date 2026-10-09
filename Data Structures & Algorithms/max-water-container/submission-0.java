class Solution {
    public int maxArea(int[] heights) {
        
        int lp = 0;
        int rp = heights.length-1;
        int area = 0;

        while(lp < rp){
            area = Math.max(area, Math.abs(rp-lp)*Math.min(heights[lp], heights[rp]));
            if(heights[rp] < heights[lp]){
                rp--;
            }else{
                lp++;
            }
        }
        return area;
    }
    
}
