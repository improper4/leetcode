public class PlusOne {
    public int[] plusOne(int[] d) {
        int c = 0;
        d[d.length -1] += 1;
        for(int i = d.length -1; i >= 0; i--){
            int sum = d[i] + c;
            d[i] = sum % 10;
            c = sum > 9 ? 1: 0;
        }
        if(c == 1){
            int[] ans = new int[d.length+1];
            ans[0] = 1;
            for(int i = 0; i < d.length; i++){
                ans[i+1] = d[i];
            }
            return ans;
        }else{
            return d;
        }
    }
}