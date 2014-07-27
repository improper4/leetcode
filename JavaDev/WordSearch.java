public class WordSearch {
    static int[] dr = {1, 0, -1, 0};
    static int[] dc = {0, -1, 0, 1};
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] used = new boolean[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++)if(board[i][j] == word.charAt(0)){
                for(int k = 0; k < rows; k++){
                    Arrays.fill(used[k], false);
                }
                used[i][j] = true;
                if(dfs(i, j, 1,word, board, used)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean dfs(int r, int c, int idx, String word, char[][] board, boolean[][] used){
        int rows = board.length;
        int cols = board[0].length;
        if(idx == word.length()){
            return true;
        }
        for(int i = 0; i < 4; i++){
            int nr = r + dr[i];
            int nc = c + dc[i];
            if(nr >= 0 && nr < rows && nc >= 0 && nc < cols && !used[nr][nc]
                 && word.charAt(idx) == board[nr][nc]){
                    
                used[nr][nc] = true;
                if(dfs(nr, nc, idx+1, word, board, used)) return true;
                used[nr][nc] = false;
            }
        }
        return false;
    }
}