public class InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length();
    int n = s2.length();
    int s = s3.length();
    if(m + n != s)
        return false;

    boolean[][] dp = new boolean[n + 1][m + 1];
    dp[0][0] = true;

    for(int i = 0; i < n + 1; i++)
        for(int j = 0; j < m + 1; j++) {
            if(dp[i][j] || (i - 1 >= 0 && dp[i - 1][j] == true && s2.charAt(i - 1) == s3.charAt(i + j - 1))
            || ( j - 1 >= 0 && dp[i][j - 1] == true && s1.charAt(j - 1) == s3.charAt(i + j - 1)))
                dp[i][j] = true;
            else
                dp[i][j] = false;
    }

    return dp[n][m];
    }
}