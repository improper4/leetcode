public class PalindromePartitions {
    ArrayList<ArrayList<String>> ans;
    public ArrayList<ArrayList<String>> partition(String s) {
        ans = new ArrayList<ArrayList<String>>();
        ArrayList<String> tmp = new ArrayList<String>();
        solve(s, tmp);
        return ans;
    }
    void solve(String s, ArrayList<String> tmp){
        if(s.equals("")){
            ans.add(new ArrayList<String>(tmp));
        }else{
            for(int i = 1; i <= s.length(); i++){
                if(isPali(s.substring(0, i))){
                    tmp.add(s.substring(0,i));
                    solve(s.substring(i), tmp);
                    tmp.remove(tmp.size() -1);
                }
            }
        }
    }
    boolean isPali(String str){
        int i = 0, j = str.length() -1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
}