public class TrappingRainWater {
    public int trap(int[] A) {
        int high = 0, ans = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] > A[high]) high = i;
        }
        
        for(int i = 0, top = 0; i < high; i++){
            if(A[i] >= top){
                top = A[i];
            }else{
                ans += top - A[i];
            }
        }

        for(int i = A.length-1, top = 0; i > high; i--){
            if(A[i] >= top){
                top = A[i];
            }else{
                ans += top - A[i];
            }
        }
        return ans;
    }
}