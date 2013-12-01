public class SearchInSortedArr {
    public int search(int[] A, int target) {
        int left = 0, right = A.length -1;
        while(left <= right){       // you must watch out the = operator.
            int mid = (left + right) / 2;
            if(A[mid] == target) return mid;
            if(A[mid] >= A[left]){
                if(target >= A[left] && target < A[mid]){
                    right = mid -1;
                }else{
                    left = mid +1;
                }
            }else{
                if(target > A[mid] && target <= A[right]){
                    left = mid +1;
                }else{
                    right = mid -1;
                }
            }
        }
        return -1;
    }
}