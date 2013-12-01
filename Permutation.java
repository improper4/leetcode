public class Permutation {
    ArrayList<ArrayList<Integer>> ans;
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ans = new ArrayList<ArrayList<Integer>>();
        perm(num, 0);
        return ans;
    }
    void perm(int[] num, int from){
        
        if(from == num.length){
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            for(int x: num)
                tmp.add(x);
            ans.add(tmp);
        }else{
            for(int i = from; i < num.length; i++){
                swap(num, i, from);
                perm(num, from+1);
                swap(num, i, from);
            }
        }
    }
    void swap(int[] num, int i, int j){
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }
}