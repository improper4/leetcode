public class Solution {
    public String minWindow(String S, String T) {
        if(S == null || T == null) return null;
        int[] t = new int[256];                    //chars in T
        int[] s = new int[256];                    //chars found in S between ori and r
        String rl = "";
        for(int i = 0; i < T.length(); i++) t[T.charAt(i)]++;

        for(int ori = 0, r = 0, len = 0; r < S.length(); r++){
            if(t[S.charAt(r)] >= ++s[S.charAt(r)]) len++;
            if(len < T.length()) continue;
            while(s[S.charAt(ori)] > t[S.charAt(ori)]) s[S.charAt(ori++)]--;
            if(rl.equals("") || rl.length() > r - ori + 1) rl = S.substring(ori, r + 1);
        }
        
        return rl;
    }
}