public class Strstr {
    public String strStr(String ha, String nl) {
        int i, j;
        for(i = 0; i < ha.length() - nl.length()+1; i++){
            for(j = 0; j < nl.length(); j++){
                if(ha.charAt(i + j) != nl.charAt(j)){
                    break;
                }
            }
            if(j == nl.length()) return ha.substring(i);
        }
        return null;
    }
}