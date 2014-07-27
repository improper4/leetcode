public class CombinationSum {
    ArrayList<ArrayList<Integer>> ans;
    public ArrayList<ArrayList<Integer>> combinationSum(int[] can, int x) {
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
            for(int i = from; i < can.length; i++){
                if(x >= can[i]){
                    tmp.add(can[i]);
                    solve(can, x - can[i], i, tmp);
                    tmp.remove(tmp.size() -1);
                }
            }
        }
    }
}