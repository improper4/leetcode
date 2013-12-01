public class SetMatrixZeroes {
    public void setZeroes(int[][] ma) {
        int m = ma.length;
        int n = ma[0].length;
        int flagR = 0, flagC = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(ma[i][j] == 0){
                    if(i == 0){
                        flagR = 1;
                    }else{
                        ma[0][j] = 0;
                    }
                    if(j == 0){
                        flagC = 1;
                    }else{
                        ma[i][0] = 0;
                    }
                }
            }
        }
        for(int i = 1; i < m; i++){
            if(ma[i][0] == 0){
                for(int j = 1; j < n; j++){
                    ma[i][j] = 0;
                }
            }
        }
        for(int i = 1; i < n; i++){
            if(ma[0][i] == 0){
                for(int j = 1; j < m; j++){
                    ma[j][i] = 0;
                }
            }
        }
        if(flagC == 1){
            for(int i = 0; i < m; i++){
                ma[i][0] = 0;
            }
        }
        if(flagR == 1){
            for(int i = 0; i < n; i++){
                ma[0][i] = 0;
            }
        }
    }
}