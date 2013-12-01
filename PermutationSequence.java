public class PermutationSequence {
    public String getPermutation(int n, int k) {
        // Cantor expansion
        ArrayList<Integer> sets = new ArrayList<Integer>();
        String ans = "";
        int fact = 1;
        for(int i = 1; i <= n; i++){
            sets.add(i);
            fact *= i;
        }
        k--;
        for(int i = n; i > 0; i--){
            fact /= i;
            int idx = k/ fact;
            ans += sets.get(idx);
            sets.remove(idx);
            k %= fact;
        }
        return ans;
    }
}