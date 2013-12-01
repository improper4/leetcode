public class SearchInRotatedArr2 {
    public boolean search(int[] A, int x) {
        int left = 0, right = A.length -1;
        while(left <= right){
            int mid = (left + right) /2;
            if(A[mid] == x) return true;
            if(A[mid] > A[left]){
                if(x < A[mid] && x >= A[left]){
                    right = mid -1;
                }else{
                    left = mid +1;
                }
            }else if(A[mid] < A[left]){
                if(x > A[mid] && x <= A[right]){
                    left = mid +1;
                }else{
                    right = mid -1;
                }
            }else{
                left++;
            }
        }
        return false;
    }
}