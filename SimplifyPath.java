public class SimplifyPath {
    public String simplifyPath(String path) {
        String p = path + '/';
        Stack<String> ss = new Stack<String>();
        StringBuffer tmp = new StringBuffer();
        for(int i = 0; i < p.length(); i++){
            char ch = p.charAt(i);
            if(ch == '/'){
            	if(i > 2 && p.charAt(i -1) == '.' && p.charAt(i -2) == '.' &&
            	    ( p.charAt(i - 3) == '/')){
            		if(!ss.isEmpty()) ss.pop();
            	}else if((i > 0 && p.charAt(i -1) == '/') ||
            	    (i > 1 && p.charAt(i -2) != '.' && p.charAt(i -1) == '.')){
         
            	}else {
					if(i > 0)ss.push(tmp.toString());
				}
            	tmp = new StringBuffer("/");
            }else {
            	tmp.append(ch);
			}
        }
        if (ss.size() == 0) return "/";

        StringBuffer buf = new StringBuffer();
        while (!ss.isEmpty()) {
            buf.insert(0, ss.pop());
        }
        return buf.toString();
    }

    /*
    public String simplifyPath(String path) {
        if (path == null || path.length() == 0) return "/";

        Stack<String> stack = new Stack<String>();
        String[] splits = path.trim().split("/");
        for (String s : splits) {
            if (s == null || s.length() == 0 || s.equals(".")) {
                // Do nothing;
            } else if (s.equals("..")) {
                // Pop if stack is not empty;
                if (stack.size() > 0) stack.pop();
            } else {
                // Push all others to stack.
                stack.push(s);
            }
        }

        // Remember, stack can be empty.
        if (stack.isEmpty()) return "/";

        StringBuffer buf = new StringBuffer();
        while (!stack.isEmpty()) {
            buf.insert(0, stack.pop());
            buf.insert(0, "/");
        }

        return buf.toString();
    }
    */
}