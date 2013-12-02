public class PascalTriangle {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> last = new ArrayList<Integer>();
        for(int i = 0; i < numRows; i++){
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            for(int j = 0; j < last.size(); j++){
                if(j == 0){
                    tmp.add(1);
                }else{
                    tmp.add(last.get(j) + last.get(j-1));
                }
            }
            tmp.add(1);
            ans.add(tmp);
            last = tmp;
        }
        return ans;
    }
}