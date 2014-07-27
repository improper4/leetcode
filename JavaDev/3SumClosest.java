public class 3SumClosest {
    public int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        int ans = num[0]+ num[1]+ num[2];
        for(int i = 0; i < num.length-2; i++){
            if(i == 0 || num[i-1] != num[i]){
                int left = i+1, right = num.length-1;
                while(left < right){
                    int now = num[i] + num[left] + num[right];
                    if(Math.abs(now -target) < Math.abs(ans -target)){
                        ans = now;
                    }
                    if(now > target){
                        right--;
                    }else if(now < target){
                        left++;
                    }else{
                        return now;
                    }
                }
            }
        }
        return ans;
    }
}