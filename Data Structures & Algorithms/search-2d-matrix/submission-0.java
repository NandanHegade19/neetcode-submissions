class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rowIndex = getPotentialRow(matrix, target);
        if(rowIndex != -1){
            return searchInThatPotentialRow(rowIndex, matrix, target);
        }else{
            return false;
        }

    }

    public int getPotentialRow(int[][] matrix, int target){
        int low = 0;
        int high = matrix.length - 1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(matrix[mid][0] <= target && target <= matrix[mid][matrix[0].length-1]){
                return mid;
            }
            else if(matrix[mid][0] < target){
                low = mid+1;
            }else if(matrix[mid][0] > target){
                high = mid-1;
            }
        }
        return -1;
    }

    public boolean searchInThatPotentialRow(int rowIndex, int[][] matrix, int target){
        int lp = 0;
        int rp = matrix[rowIndex].length -1;

        while(lp <= rp){
            int mid = lp + (rp-lp)/2;
            if(matrix[rowIndex][mid] < target){
                lp = mid +1;
            }else if(matrix[rowIndex][mid] > target){
                rp = mid -1;
            }else if(matrix[rowIndex][mid] == target){
                return true;
            }
        }
        return false;
    }
}
