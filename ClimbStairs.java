public class ClimbStairs {
    public int climbStairs(int n) {
        int ans = 1, prev = 1;
        for(int i = 2; i <= n; i++){
            int tmp = ans + prev;
            prev = ans;
            ans = tmp;
        }
        return ans;
    }
}