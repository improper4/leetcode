public class DivideTwoInt {
    public int divide(int dividend, int divisor) {
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int ans = 0;
        while(a >= b){
            long c = b;
            for(int i = 0; a >= c; i++, c <<= 1){
                a -= c;
                ans += 1 << i;
            }
        }
        return (dividend < 0) ^ (divisor < 0)? -ans: ans;
    }
}