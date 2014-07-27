public class 3Sum {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(num);
        for(int i = 0; i < num.length; i++){
            if((i == 0 || num[i -1] != num[i]) && num[i] <= 0){
                helper(num, i, ans);
            }
        }
        return ans;
    }
    
    void helper(int[] num, int now, ArrayList<ArrayList<Integer>> ans){
        int left = now+1, right = num.length -1;
        while(left < right){
            if(num[left] + num[right] + num[now] > 0){
                right--;
            }else if(num[left] + num[right] + num[now] < 0){
                left++;
            }else{
                ArrayList<Integer> tmp = new ArrayList<Integer>();
                tmp.add(num[now]);
                tmp.add(num[left]);
                tmp.add(num[right]);
                ans.add(tmp);
                //the accept code must contain the next 2 lines
                do{left++; }while(left < right && num[left] == num[left -1]);
				do{right--;}while(left < right && num[right] == num[right +1]);
            }
        }
    }
}