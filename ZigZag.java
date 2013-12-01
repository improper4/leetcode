public class ZigZag {
    public String convert(String s, int nRows) {
        if (nRows == 1) return s;

        int diff = nRows + nRows - 2;
        StringBuffer tmp = new StringBuffer();
        for(int i = 0; i < nRows; i++){
            int idx = i;
            while(idx < s.length()){
                tmp.append(s.charAt(idx));
                idx += diff;
                if(i != 0 && i != nRows - 1 && idx - i- i < s.length()){
                    tmp.append(s.charAt(idx -i -i));
                }
            }
        }
        return tmp.toString();
    }
}