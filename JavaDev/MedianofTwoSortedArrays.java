public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int A[], int B[]) {
        
        int n = (A.length + B.length);
        if(n % 2 == 0){
            return (double)(findKSortedArrays(A, 0,A.length, B, 0,B.length, n/ 2) +
            findKSortedArrays(A, 0, A.length,B,0,B.length, n /2 + 1)) / 2.0;
        }else{
            return findKSortedArrays(A, 0,A.length, B, 0,B.length, n/2 +1);
        }
    }
    double findKSortedArrays(int[] A, int fromA,int reA, int[] B,int fromB, int reB,int k){
        if(reA > reB) return findKSortedArrays(B, fromB,reB, A, fromA,reA, k);

        if(reA == 0) return B[fromB + k -1];
        if(k == 1) return Math.min(A[fromA], B[fromB]);
        int amid = Math.min(k/2, reA);
        int bmid = k - amid;
        if(A[fromA+amid-1] < B[fromB+ bmid-1]){
            return findKSortedArrays(A, fromA + amid, reA - amid, B, fromB,reB, k - amid);
        }else if(A[fromA+ amid-1] > B[fromB +bmid-1]){
            return findKSortedArrays(A, fromA,reA, B, fromB + bmid, reB - bmid, k - bmid);
        }else{
            return A[fromA+ amid -1];
        }
    }
}