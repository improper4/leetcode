public class RmDupInSortedArr {
    public int removeDuplicates(int[] A) {
        int cnt = 0;
        for(int i = 0; i < A.length; i++){
            if(i == 0 || A[i -1] != A[i]){
                A[cnt++] = A[i];
            }
        }
        return cnt;
    }
}