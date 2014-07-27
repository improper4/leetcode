public class NQueens {
    ArrayList<String[]> ans;
    public ArrayList<String[]> solveNQueens(int n) {
        ans = new ArrayList<String[]>();
        int[] col = new int[n];
        solve(0, col, n);
        return ans;
    }
    void solve(int from, int[] col, int n){
        if(from == n){
            String[] tmp = new String[n];
            for(int i = 0; i < n; i++)
                tmp[i] = geneQueen(col[i], n);
            ans.add(tmp);
        }else{
            for(int i = 0; i < n; i++){
                if(nofight(col, from, i)){
                    col[from] = i;
                    solve(from+1, col, n);
                }
            }
        }
    }
    String geneQueen(int idx, int n){
        char[] ans = new char[n];
        for(int i = 0; i < n; i++){
            if(i == idx) ans[i] = 'Q';
            else ans[i] = '.';
        }
        return new String(ans);
    }
    boolean nofight(int[] col, int idx, int c){
        for(int i = 0; i < idx; i++)
            if(col[i] == c || Math.abs(idx -i) == Math.abs(c - col[i]))
                return false;
        return true;
    }
}