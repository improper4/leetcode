public class Subsets {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        
        Arrays.sort(S);
        solve(S, 0, ans, new ArrayList<Integer>());
        return ans;
    }
    void solve(int[] S, int from, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> tmp){
        if(from == S.length){
            ArrayList<Integer> now = new ArrayList<Integer>(tmp);
            ans.add(now);
            return;
        }
        solve(S, from+1, ans, tmp);
        tmp.add(S[from]);
        solve(S, from +1, ans, tmp);
        tmp.remove(tmp.size() -1);
    }

    /*
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        Arrays.sort(S);
        return solve(S, S.length -1);
    }
    ArrayList<ArrayList<Integer>> solve(int[] S, int from){
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if(from == -1) {
            ret.add(new ArrayList<Integer>());
            return ret;
        }
        for(ArrayList<Integer> list: solve(S, from-1)){
            ret.add(list);
            ArrayList<Integer> tmp = new ArrayList<Integer>(list);
            tmp.add(S[from]);
            ret.add(tmp);
        }
        return ret;
    }
    */
}