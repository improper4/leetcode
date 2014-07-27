public class MinPathInTriangle {
    public int minimumTotal(ArrayList<ArrayList<Integer>> tri) {
        int n = tri.size();
        int[][] dp = new int[n+1][n+1];
        for(int i = n -1; i >= 0; i--){
            for(int j = 0; j < tri.get(i).size(); j++){
                dp[i][j] = Math.min(dp[i+1][j], dp[i+1][j +1]) + tri.get(i).get(j);
            }
        }
        return dp[0][0];
    }
}