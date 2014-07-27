public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int cnt = 0, min = Integer.MAX_VALUE;
        int idx = 0;
        for(int i = 0; i < gas.length; i++){
            cnt += (gas[i] - cost[i]);
            if(cnt < min){
                min = cnt;
                idx = i;
            }
        }
        return cnt < 0? -1: (idx+1) % gas.length;
    }
}