public class CountAndSay {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String ans = "1";
        for(int i = 1; i < n; i++){
            ans = solve(ans);
        }
        return ans;
    }
    String solve(String str){
        StringBuffer ans = new StringBuffer();
        int cnt = 1;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(i +1 < str.length() && str.charAt(i +1) == ch){
                cnt++;
            }else{
                ans.append(cnt+""+ch);
                cnt = 1;
            }
        }
        return ans.toString();
    }
}