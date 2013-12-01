/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class InsertInterval {
    public ArrayList<Interval> insert(ArrayList<Interval> interval, Interval x) {
        int idx = 0, n = interval.size();
        ArrayList<Interval> ans = new ArrayList<Interval>();
        while(idx < n && interval.get(idx).end < x.start){
            ans.add(interval.get(idx++));
        }
        while(idx < n && interval.get(idx).start <= x.end){
            x.start = Math.min(x.start, interval.get(idx).start);
            x.end = Math.max(x.end, interval.get(idx).end);
            idx++;
        }
        ans.add(x);
        while(idx < n){
            ans.add(interval.get(idx++));
        }
        return ans;
    }
}