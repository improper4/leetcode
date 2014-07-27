public class RmDupInArr2 {
    public int removeDuplicates(int[] A) {
        int cnt = 0, flag = 0;
        for(int i = 0; i < A.length; i++){
            if(i == 0 || A[i -1] != A[i]){
                A[cnt++] = A[i];
                flag = 0;
            }else if(flag == 0){
                flag++;
                A[cnt++] = A[i];
            }
        }
        return cnt;
    }
}