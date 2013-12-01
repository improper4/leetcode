public class CombinationWithK {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        
        if(k == 1){
            for(int i = 1; i <= n; i++){
                ArrayList<Integer> tmp = new ArrayList<Integer>();
                tmp.add(i);
                ans.add(tmp);
            }
        }else{
            for(int i = n; i >= k; i--){
                for(ArrayList<Integer> al: combine(i-1, k-1)){
                    al.add(i);
                    ans.add(al);
                }
            }
        }
        return ans;
    }
}