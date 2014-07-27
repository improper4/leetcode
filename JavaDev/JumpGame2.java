public class JumpGame2 {
    public int jump(int[] A) {
        int ans = 0, last = 0, cur = 0;
        for(int i = 0; i < A.length; i++){
            if(i > last){
                last = cur;
                ans++;
            }
            cur = Math.max(cur, A[i] +i);
        }
        return ans;
    }
}