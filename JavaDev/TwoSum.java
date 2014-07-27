public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans= new int[2];
        HashMap<Integer, Integer> sets = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < numbers.length; i++){
            if(sets.containsKey(numbers[i])){
                ans[0] = sets.get(numbers[i]);
                ans[1] = i+ 1;
                break;
            }else{
                sets.put(target -numbers[i], i +1);
            }
        }
        return ans;
    }
}