public class NQueens2 {
    static int result = 0;
    static int upperLimit = 0;
    
    public static int totalNQueens(int n) {
        upperLimit = (1 << n)- 1;
        result = 0;
        int row = 0;
        int ld = 0;
        int rd = 0;
        dfs(row,ld,rd);
        return result;
    }

    private static void dfs(int row, int ld, int rd) {
        if(row >= upperLimit){
            result++;
            return;
        }
        int pos = upperLimit &(~(row|ld|rd));
        int p = 0;
        while(pos > 0){
            p = pos & (~pos+ 1);
            pos = pos- p;
            dfs(row+ p,(ld+ p)<< 1,(rd+ p)>> 1);
        }
    }
}