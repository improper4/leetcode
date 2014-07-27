public class SortColor {
    public void sortColors(int[] A) {
        int idx0 = 0, idx2 = A.length -1;
        for(int i = 0; i <= idx2; i++){
            if(A[i] == 0){
                swap(A, idx0++, i);
            }else if(A[i] == 2){
                swap(A, idx2--, i--);
            }
        }
    }
    void swap(int[] A, int a, int b){
        int tmp = A[a];
        A[a] = A[b];
        A[b] = tmp;
    }
}