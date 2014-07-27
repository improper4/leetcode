public class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        LinkedList<Character> ss = new LinkedList<Character>();
        ss.push('A');
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '[' || ch == '{' || ch == '('){
                ss.push(ch);
            }else{
                char top = ss.peek();
                if(top == 'A') return false;
                if((top == '[' && ch == ']') || (top == '{' && ch == '}') 
                    || (top == '(' && ch == ')')){
                    ss.pop();
                }else{
                    return false;
                }
            }
        }
        if(ss.peek() == 'A'){
            return true;
        }
        return false;
    }
}