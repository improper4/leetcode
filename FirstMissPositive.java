public class FirstMissPositive {
    public int firstMissingPositive(int[] A) {
        int n = A.length;
        for(int i = 0; i < n; i++){
            if(A[i] <= n && A[i] > 0){
                if(i != A[i] -1 && A[i] != A[A[i]-1]){
                    swap(A, i, A[i] -1);
                    i--;
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(A[i] != i+1) return i+1;
        }
        return n+1;
    }
    void swap(int[] A, int i, int j){
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}