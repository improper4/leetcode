public class SearchRange {
    public int[] searchRange(int[] A, int x) {
        int[] ans = {-1, -1};
        int left = 0, right = A.length -1;
        
        while(left <= right){
            int mid = (left +right)/ 2;
            if(A[mid] < x- 0.5){
                left = mid +1;
            }else{
                right = mid-1;
            }
        }
        if(left>= A.length || A[left] != x) return ans;
        ans[0] = left;
        right = A.length -1;
        while(left <= right){
            int mid = (left + right)/ 2;
            if(A[mid] < x + 0.5){
                left = mid +1;
            }else{
                right = mid -1;
            }
        }
        ans[1] = left -1;
        return ans;
    }
}