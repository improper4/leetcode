public class PhoneNumAndLetter {
    static String[] sets = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public ArrayList<String> letterCombinations(String digits) {
       
        ArrayList<String> ans = new ArrayList<String>();
        if(digits.length() == 0){
            ans.add("");
        }else for(String str: letterCombinations(digits.substring(1))){
            for(char ch: sets[digits.charAt(0) -'0' - 2].toCharArray()){
                ans.add(ch + str);
            }
        }
        return ans;
    }
}