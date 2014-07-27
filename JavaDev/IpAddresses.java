public class IpAddresses {
    ArrayList<String> ans;
    public ArrayList<String> restoreIpAddresses(String s) {
        ans = new ArrayList<String>();
        int[] tmp = new int[4];
        solve(0, 0, s, tmp);
        return ans;
    }
    void solve(int cnt, int from, String s, int[] tmp){
        if((from == s.length() && cnt < 3)|| (cnt == 4 && from < s.length())) return;
        if(cnt == 4 && from == s.length()){
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < 4; i++){
                sb.append(tmp[i]);
                if(i != 3) sb.append(".");
            }
            ans.add(sb.toString());
        }else{
            for(int i = from+1; i- from <= 3 && i <= s.length(); i++){
                
                tmp[cnt] = Integer.parseInt(s.substring(from, i));
                if(tmp[cnt] == 0){
                    solve(cnt+1, i, s, tmp);
                    break;
                }
                if(tmp[cnt] > 0 && tmp[cnt] < 256){
                    solve(cnt+1, i, s, tmp);
                }
            }
        }
    }
}