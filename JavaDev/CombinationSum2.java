public class CombinationSum2 {
    ArrayList<ArrayList<Integer>> ans;
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] can, int x) {
        ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        Arrays.sort(can);
        solve(can,x, 0, tmp);
        return ans;
    }
    void solve(int[] can, int x, int from, ArrayList<Integer> tmp){
        
        if(x == 0){
            ans.add(new ArrayList<Integer>(tmp));
        }else{
            int last = -1;
            for(int i = from; i < can.length; i++){
                if(x >= can[i] && can[i] != last){
                    last = can[i];
                    tmp.add(can[i]);
                    solve(can, x - can[i], i+1, tmp);
                    tmp.remove(tmp.size() -1);
                }
            }
        }
    }
}