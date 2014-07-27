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
    /*
    public int[] searchRange(int[] A, int x) {
        int[] ans = {-1, -1};
        int left = 0, right = A.length -1;
        
        while(left < right){
            int mid = (left +right)/ 2;
            if(A[mid] < x){
                left = mid +1;
            }else{
                right = mid;
            }
        }
        if(A[left] != x) return ans;
        ans[0] = left;
        right = A.length;
        while(left < right){
            int mid = (left + right)/ 2;
            if(A[mid] <= x){
                left = mid +1;
            }else{
                right = mid;
            }
        }
        ans[1] = right -1;
        return ans;
    }
    */
}