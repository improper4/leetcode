public class PalindromePartitions2 {
    public int minCut(String s) {
        int n = s.length();
        int[] dp = new int[n +1];
        boolean[][] palin = new boolean[n][n];
        for(int i = 0; i < n; i++){
            dp[i] = n-i - 1;
        }
        
        for(int i = n -2; i >= 0; i--){
            for(int j = i; j < n; j++){
                if(s.charAt(i) == s.charAt(j) &&(j < i+2 || palin[i+1][j -1])){
                    palin[i][j] = true;
                    if(j == n-1) dp[i] = 0;
                    else dp[i] = Math.min(dp[i], dp[j+ 1] + 1);
                }
            }
        }
        return dp[0];
    }
}