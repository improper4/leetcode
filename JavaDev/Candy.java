public class Candy {
    public int candy(int[] ra) {
        int N = ra.length;
        int ans = N;
        int[] inc = new int[ra.length];
        for(int i = N-2, cnt = 1; i >= 0; i--){
            if(ra[i] > ra[i+1])
                inc[i] = Math.max(cnt++, inc[i]);
            else
                cnt = 1;
        }
        for(int i = 1, cnt = 1; i < N; i++){
            if(ra[i] > ra[i -1])
                inc[i] = Math.max(cnt++, inc[i]);
            else
                cnt = 1;
        }
        for(int i = 0; i < N; i++)
            ans += inc[i];
        return ans;
    }
}