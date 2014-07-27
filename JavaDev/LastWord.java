public class LastWord {
    public int lengthOfLastWord(String s) {
        String[] tmp = s.split(" ");
        if(tmp.length == 0) return 0;
        return tmp[tmp.length -1].length();
    }
}