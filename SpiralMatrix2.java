public class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int i = 0, j = 0, cnt = 1;
        if(n == 0) return ans;
        ans[0][0] = 1;
        while(cnt < n* n){
            while(j+1 < n && ans[i][j+1] == 0) ans[i][++j] = ++cnt;
            while(i+1 < n && ans[i+1][j] == 0) ans[++i][j] = ++cnt;
            while(j > 0 && ans[i][j -1] == 0) ans[i][--j] = ++cnt;
            while(i > 0 && ans[i-1][j] == 0) ans[--i][j] = ++cnt;
        }
        
        return ans;
    }
}