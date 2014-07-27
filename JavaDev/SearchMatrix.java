public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int x) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0, high = rows* cols -1;
        while(low <= high){
            int mid = (low + high) / 2;
            int val = matrix[mid / cols][mid % cols];
            if(val == x) return true;
            if(val > x){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return false;
    }

    /*
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length -1;
        while(i < matrix.length && i >=0 && j >=0 && j <= matrix[0].length){
            if(matrix[i][j] == target) return true;
            if(matrix[i][j] > target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
    */
}