public class UniquePath2 {
    public int uniquePathsWithObstacles(int[][] g) {
        int rows = g.length;
        if(rows == 0) return 0;
        int cols = g[0].length;
        int[][] dp = new int[rows][cols];
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++)if(g[i][j] != 1){
                if(i == 0){
                    dp[i][j] = (j == 0)? 1: g[i][j -1] == 1 ? 0: dp[i][j -1];
                }else if(j == 0){
                    dp[i][j] = g[i- 1][j] == 1 ? 0: dp[i -1][j];
                }else{
                    dp[i][j] = (g[i][j -1] == 1 ? 0: dp[i][j -1]) + 
                                (g[i- 1][j] == 1 ? 0: dp[i -1][j]);
                }
            }
        }
        return dp[rows -1][cols -1];
    }
}