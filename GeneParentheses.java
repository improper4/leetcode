public class GeneParentheses {
    ArrayList<String> ans;
    public ArrayList<String> generateParenthesis(int n) {
        ans = new ArrayList<String>();
        char[] sets = new char[n*2];
        solve(0, 0, sets);
        return ans;
    }
    void solve(int left, int right, char[] sets){
        if(left + right == sets.length){
            ans.add(new String(sets));
            return;
        }
        if(left > right){
            sets[left + right] = ')';
            solve(left, right +1, sets);
        }
        if(left < sets.length/ 2){
            sets[left + right] = '(';
            solve(left+1, right, sets);
        }
    }
}