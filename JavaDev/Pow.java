public class Pow {
    public double pow(double x, int n) {
        if(n == 0) return 1;
        double tmp = pow(x, n /2);
        if(n % 2 == 0) return tmp * tmp;
        if(n > 0) return tmp * tmp * x;
        return tmp * tmp / x;
    }
}