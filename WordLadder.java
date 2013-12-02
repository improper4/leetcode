public class WordLadder {
    public int ladderLength(String start, String end, HashSet<String> dict) {
        HashMap<String, Boolean> sets = new HashMap<String, Boolean>();
        for(String s: dict){
            sets.put(s, false);
        }
        sets.put(start, true);
        sets.put(end, false);
        LinkedList<String> q = new LinkedList<String>();
        LinkedList<Integer> qlvls = new LinkedList<Integer>();
        q.offer(start);
        qlvls.offer(1);
        while(!q.isEmpty()){
            String str = q.poll();
            int lvl = qlvls.poll();
            if(str.equals(end)){
                return lvl;
            }
            for(int i = 0; i < str.length(); i++){
                StringBuffer sb = new StringBuffer(str);
                for(char ch = 'a'; ch < 'z'; ch++){
                    sb.setCharAt(i,ch);
                    String tmp = sb.toString();
                    if(sets.containsKey(tmp) && !sets.get(tmp)){
                        sets.put(tmp, true);
                        q.offer(tmp);
                        qlvls.offer(lvl +1);
                    }
                }
            }
            
        }
        return 0;
    }
}