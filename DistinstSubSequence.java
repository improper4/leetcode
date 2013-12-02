public class DistinctSubSequence {
    public int numDistinct(String S, String T) {
        int sn = S.length();
        int tn = T.length();
        int[][] dp = new int[sn+1][tn +1];
        for(int i = 0; i < sn; i++) dp[i][0] = 1;
        for(int i = 1; i <= sn; i++){
            for(int j = 1; j <= i && j <= tn ; j++){
                dp[i][j] = dp[i -1][j];
                if(S.charAt(i -1) == T.charAt(j -1)){
                    dp[i][j] += dp[i -1][j -1];
                }
            }
        }
        return dp[sn][tn];
    }
}