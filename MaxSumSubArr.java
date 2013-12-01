public class MaxSumSubArr {
    public int maxSubArray(int[] A) {
        return solve(A, 0, A.length -1);
    }
    
    int solve(int[] A, int from, int to){
        if(from == to) return A[from];
        int mid = (from + to) /2;
        int left = solve(A, from, mid);
        int right = solve(A, mid+1, to);
        int leftBoard = 0, maxLeftBoard = Integer.MIN_VALUE;
        for(int i = mid; i >= from; i--){
            leftBoard += A[i];
            if(leftBoard > maxLeftBoard)
                maxLeftBoard = leftBoard;
        }
        int rightBoard = 0, maxRightBoard = Integer.MIN_VALUE;
        for(int i = mid+1; i <= to; i++){
            rightBoard += A[i];
            maxRightBoard = Math.max(maxRightBoard, rightBoard);
        }
        return Math.max(Math.max(left, right), maxLeftBoard + maxRightBoard);
    }
    /*
    public int maxSubArray(int[] A) {
        int max = Integer.MIN_VALUE, f = 0;
        for(int i = 0; i < A.length; i++){
            f = Math.max(f + A[i], A[i]);
            max = Math.max(max, f);
        }
        return max;
    }
    */
}