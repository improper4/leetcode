public class UniqueBST {
    public int numTrees(int n) {
        int[] sets = new int[n+1];
        sets[0] = 1;
        sets[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= i; j++){
                sets[i] += sets[j-1] * sets[i - j];
            }
        }
        return sets[n];
    }
}