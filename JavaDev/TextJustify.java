public class TextJustify {
    public ArrayList<String> fullJustify(String[] words, int L) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> res = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        int cur = 0;
        int len = 0;
    
        while (cur < words.length) {
            sb.setLength(0);
            sb.append(words[cur]);
    
            list.clear();
            len = words[cur].length();
            cur++;
    
            while (cur<words.length && len + 1 + words[cur].length() <= L) {
                list.add(" " + words[cur]);
                len += words[cur].length() + 1;
                cur++;
            }
    
            if (cur < words.length && list.size() > 0) {
                int spaces = L - len;
                int avg = spaces / list.size();
                int rem = spaces % list.size();
                for (int i=0; i<list.size(); i++) {
                    appendSpaces(sb, i<rem? avg+1 : avg);
                    sb.append(list.get(i));
                }
            }
            else {
                for (int i=0; i<list.size(); i++) sb.append(list.get(i));
                appendSpaces(sb, L - len);
            }
    
            res.add(sb.toString());
        }
        return res;
    }
    
    private void appendSpaces(StringBuilder sb, int n) {
        for (int i=0; i<n; i++) sb.append(' ');
    }
}