public class ValidNumber {
    public final static int INVALID = 0;
    public final static int SPACE = 1;
    public final static int SIGN = 2;
    public final static int DIGIT = 3;
    public final static int DOT = 4;
    public final static int EXPONENT = 5;
        
    public boolean isNumber(String s) {
        int [][] state = {
        {-1,  0,  3,  1,  2, -1},    // next states for state 0
        {-1,  8, -1,  1,  4,  5},    // next states for state 1
        {-1, -1, -1,  4, -1, -1},    // next states for state 2
        {-1, -1, -1,  1,  2, -1},    // next states for state 3
        {-1,  8, -1,  4, -1,  5},    // next states for state 4
        {-1, -1,  6,  7, -1, -1},    // next states for state 5
        {-1, -1, -1,  7, -1, -1},    // next states for state 6
        {-1,  8, -1,  7, -1, -1},    // next states for state 7
        {-1,  8, -1, -1, -1, -1}    // next states for state 8
    };
        int now = 0, idx = 0;
        while(idx < s.length()){
            int next = 0;
            char ch = s.charAt(idx);
            if(Character.isDigit(ch)){
                next = 3;
            }else if(ch == 'e' || ch == 'E'){
                next = 5;
            }else if(ch == '.'){
                next = 4;
            }else if(ch == '-' || ch == '+'){
                next = 2;
            }else if(Character.isSpace(ch)){
                next = 1;
            }
            
            now = state[now][next];
            if(now == -1) return false;
            else idx++;
        }
        return now == 1 || now == 4 || now == 7|| now == 8;
    }
}