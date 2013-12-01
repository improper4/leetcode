public class JumpGame {
    public boolean canJump(int[] A) {
        int[] ret = new int[A.length];
        ret[A.length -1] = 0;
        for(int i = A.length -2; i >= 0; i--){
            int start = i +1;
            int end = Math.min(A.length -1, start + A[i] -1);
            int min = Integer.MAX_VALUE;
            for(int j = start; j <= end; j++){
                if(ret[j] < min) min = ret[j];
            }
            ret[i] = (min == Integer.MAX_VALUE? min : min +1);
        }
        return ret[0] == Integer.MAX_VALUE? false: true;
    }
    /*
        public boolean canJump(int[] A) {
        int max = 0;
        for(int i = 0; i < A.length-1; i++){
            if(max < i) return false;
            max = Math.max(max, i+ A[i]);
        }
        return max >= A.length-1? true: false;
    }
    */
}