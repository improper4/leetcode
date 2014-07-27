public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] num) {
        int ans = 0;
        HashMap<Integer,Boolean> sets = new HashMap<Integer, Boolean>();
        for(int i = 0; i < num.length; i++){
            sets.put(num[i], false);
        }
        for(int i = 0; i < num.length; i++){
            if(!sets.get(num[i])){
                sets.put(num[i], true);
                int tmp = num[i];
                int now = 1;
                while(sets.containsKey(--tmp)){
                    sets.put(tmp, true);
                    now++;
                }
                tmp = num[i];
                while(sets.containsKey(++tmp)){
                    sets.put(tmp, true);
                    now++;
                }
                ans = Math.max(ans, now);
            }
        }
        return ans;
    }
}