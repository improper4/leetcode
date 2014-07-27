public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rs = new boolean[9][9];
        boolean[][] cs = new boolean[9][9];
        boolean[][] bs = new boolean[9][9];
        
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.') continue;
                int c = board[i][j] - '1';
                if(rs[i][c] || cs[j][c] || bs[(i /3)* 3 + j/3][c]) return false;
                rs[i][c] = cs[j][c] = bs[(i /3)* 3 + j/3][c] = true;
            }
        }
        return true;
    }
}