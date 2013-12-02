public class MergeSortedArr {
    public void merge(int A[], int m, int B[], int n) {
        int j = n-1, i = m -1, idx = m+n -1;
        while(j >= 0 && i >= 0){
            A[idx--] = A[i]> B[j]? A[i--]: B[j--];
        }
        while(j >= 0)
            A[idx--] = B[j--];
    }
}