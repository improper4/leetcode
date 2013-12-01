public class LongestPaliSubstr {
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            String p = getPalindrome(s, i,i);
            if(p.length() > ans.length())
                ans = p;
            p = getPalindrome(s, i , i+1);
            if(p.length() > ans.length())
                ans = p;
        }
        return ans;
    }
    String getPalindrome(String s, int left, int right){
        int n = s.length();
        while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
        }
        return s.substring(left+1, right);
    }
    /*
        public String longestPalindrome(String s) {
            int max = 1, from = 0;
            boolean[][] isPa = new boolean[s.length()][s.length()];
            
            for(int i = 0; i < s.length(); i++){
                isPa[i][i] = true;
                for(int j = 0; j < i; j++){
                    isPa[j][i] = (s.charAt(j) == s.charAt(i) && (j +1 == i || isPa[j+1][i-1]));
                    if(isPa[j][i] && max < (i - j +1)){
                        max = i - j +1;
                        from = j;
                    }
                }
            }
            return s.substring(from, max+from);
        }
    */
}