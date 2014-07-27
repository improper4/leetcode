public class PalindromeNum {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int digit = 1;
        for(int y = x; y >= 10; y /= 10) digit *= 10;
        for(; digit > 1 && x / digit ==  x % 10; digit /= 100) x = x % digit / 10;
        return x < 10;
    }
}