public class Subset2 {
    ArrayList<ArrayList<Integer>> ans;
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        Arrays.sort(num);
        ans = new ArrayList<ArrayList<Integer>>();
        solve(num, 0, new ArrayList<Integer>());
        return ans;
    }
    void solve(int[] num, int idx, ArrayList<Integer> tmp){
        ans.add(new ArrayList<Integer>(tmp));
        
        for(int i = idx; i < num.length; i++){
            if(i != idx && num[i] == num[i -1]) continue;
            tmp.add(num[i]);
            solve(num, i+1, tmp);
            tmp.remove(tmp.size() -1);
        }
    }
}