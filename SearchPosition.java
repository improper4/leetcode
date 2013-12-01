public class SearchPosition {
    public int searchInsert(int[] A, int x) {
        int left = 0, right = A.length -1;
        while(left <= right){
            int mid = (left + right) /2;
            if(A[mid] == x) return mid;
            if(A[mid] < x){
                left = mid+1;
            }else{
                right = mid -1;
            }
        }
        return left;
    }
}