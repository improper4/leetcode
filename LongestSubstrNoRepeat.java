public class LongestSubstrNoRepeat {
    public int lengthOfLongestSubstring(String s) {
        int[] sets = new int[26];
        int begin = 0, ret = 0;
        Arrays.fill(sets, -1);
        for(int i = 0; i < s.length(); i++){
            begin = Math.max(begin, sets[s.charAt(i) - 'a']+1);
            sets[s.charAt(i) - 'a'] = i;
            ret = Math.max(ret, i - begin +1);
        }
        return ret;
    }
}