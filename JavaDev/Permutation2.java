public class Permutation2 {
    ArrayList<ArrayList<Integer>> ans;
    boolean[] vsd;
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        Arrays.sort(num);
        ans = new ArrayList<ArrayList<Integer>>();
        vsd = new boolean[num.length];
        solve(num, 0, new ArrayList<Integer>());
        return ans;
    }
    void solve(int[] num, int from, ArrayList<Integer> tmp){
        if(from == num.length){
            ans.add(new ArrayList<Integer>(tmp));
        }else{
            int last = Integer.MIN_VALUE;
            for(int i = 0; i < num.length; i++){
                if(!vsd[i] && num[i] != last){
                    last = num[i];
                    vsd[i] = true;
                    tmp.add(num[i]);
                    solve(num, from+1,tmp);
                    vsd[i] = false;
                    tmp.remove(tmp.size() -1);
                }
            }
        }
    }
}