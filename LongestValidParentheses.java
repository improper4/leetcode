public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int last = -1, maxLen = 0;
        LinkedList<Integer> stack = new LinkedList<Integer>();
        for(int i = 0; i < s.length(); i++){
            char now = s.charAt(i);
            if(now == '('){
                stack.push(i);
            }else{
                if(stack.isEmpty()){
                    last = i;
                }else{
                    stack.pop();
                    if(stack.isEmpty()){
                        maxLen = Math.max(maxLen, i - last);
                    }else{
                        maxLen = Math.max(maxLen, i - stack.peek());
                    }
                }
            }
        }
        return maxLen;
    }
}