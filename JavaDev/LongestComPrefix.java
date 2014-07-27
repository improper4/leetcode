public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";

        for(int i = 0; i < strs[0].length(); i++){
            for(int j = 0; j < strs.length; j++){
                if(i == strs[j].length())
                    return strs[j];
                if(strs[0].charAt(i) != strs[j].charAt(i))
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}