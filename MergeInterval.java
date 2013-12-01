/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class MergeInterval {
    public ArrayList<Interval> merge(ArrayList<Interval> sets) {
        ArrayList<Interval> ans = new ArrayList<Interval>();
        if(sets.size() == 0) return ans;
        Collections.sort(sets, new Comparator<Interval>(){
            public int compare(Interval a, Interval b){
                return a.start - b.start;
            }
        });
        
        ans.add(sets.get(0));
        Interval last = ans.get(0);
        for(Interval x: sets){
            if(x.start >= last.start && x.start <= last.end){
                last.end = Math.max(last.end, x.end);
            }else{
                ans.add(x);
            }
            last = ans.get(ans.size() -1);
        }
        return ans;
    }
}