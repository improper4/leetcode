public class DecodeWays {
    public int numDecodings(String s) {
        int n = s.length();
        if(n == 0) return 0;
        int now = 0, last = 1, lastlast = 0;
        for(int i = 1; i <= n; i++){
            if(s.charAt(i -1) == '0') now = 0;
            else now = last;
            if(i > 1 && (s.charAt(i -2) == '1' ||(s.charAt(i -2) == '2' && s.charAt(i -1) < '7'))){
                now += lastlast;
            }
            lastlast = last;
            last = now;
        }
        return now;
    }
}