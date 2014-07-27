public class AddBinary {
    public String addBinary(String a, String b) {
        int m = a.length(), n = b.length(), carry = 0;
        String ans = "";
        for(int i = 0; i < Math.max(m, n); i++){
            int fst = (i < m) ? a.charAt(m -1 - i) - '0' : 0;
            int sec = (i < n) ? b.charAt(n -1 - i) - '0' : 0;
            int sum = carry + fst + sec;
            ans = sum % 2 + ans;
            carry = sum /2;
        }
        return carry == 0 ? ans : "1" + ans;
    }
}