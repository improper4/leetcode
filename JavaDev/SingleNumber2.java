public class SingleNumber2 {
    public int singleNumber(int[] A) {
        int q1 = 0, q2 = 0;
        for(int i = 0; i < A.length; i++){
            int n1 = (q1 ^ A[i]) & ~ q2;
            int n2 = A[i] & q1 | ~A[i] & q2;
            q1 = n1;
            q2 = n2;
        }
        return q1;
    }
}