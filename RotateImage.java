public class RotateImage {
    public void rotate(int[][] ma) {
        int N = ma.length;
        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                int tmp = ma[i][j];
                ma[i][j] = ma[j][i];
                ma[j][i] = tmp;
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N/ 2; j++){
                int tmp = ma[i][j];
                ma[i][j] = ma[i][N -j- 1];
                ma[i][N -j -1] = tmp;
            }
        }
    }
}