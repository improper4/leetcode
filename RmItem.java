public class RmItem {
    public int removeElement(int[] A, int elem) {
        int idx = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] != elem){
                A[idx++] = A[i];
            }
        }
        return idx;
    }
}