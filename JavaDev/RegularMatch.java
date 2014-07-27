public class RegularMatch {
    public boolean isMatch(String s, String p) {
        return solve(s, p, 0, 0);
    }
    boolean solve(String s, String p, int sf, int pf){
        if(p.length() == pf) return sf == s.length();
        
        if(pf+1 < p.length() && p.charAt(pf+1) == '*'){
            while(sf < s.length() && (p.charAt(pf) == '.' || p.charAt(pf) == s.charAt(sf)))
                if(solve(s,p, sf++, pf+2)) return true;
            return solve(s, p, sf, pf+2);
        }else if(sf < s.length() && s.charAt(sf) == p.charAt(pf) || p.charAt(pf) == '.'){
            return solve(s, p, sf+1, pf+1);
        }
        return false;
    }
}