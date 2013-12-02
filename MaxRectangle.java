public class MaxRectangle {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0) return 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int max = 0;
        int[] hist = new int[cols +1];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == '1'){
                    hist[j]+= 1;
                }else{
                    hist[j] = 0;
                }
            }
            hist[hist.length -1] = 0;
            max = Math.max(max, maxRecHist(hist));
        }
        return max;
    }
    public int maxRecHist(int[] hist){
        Stack<Integer> ss = new Stack<Integer>();
        int max = 0;
        for(int i = 0; i < hist.length; i++){
            while(!ss.isEmpty() && hist[i] < hist[ss.peek()]){
                max = Math.max(max, hist[ss.pop()]* (ss.isEmpty()? i: i - ss.peek() -1));
            }
            ss.push(i);
        }
        return max;
    }
    /*
    public int maximalRectangle(char[][] matrix) {
        int rows = matrix.length;
        if(rows == 0) return 0;
        int cols = matrix[0].length;
        int max =0;
        // topleft coord:(r, c)
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                int[] sumC = new int[cols - c];
                int[] sumR = new int[cols - c];
                //bottomright coord:(x, y)
                for(int x = r; x < rows; x++){
                    for(int y = c; y < cols; y++){
                        sumC[y - c] = (y -c -1 >= 0 ? sumC[y -c - 1]: 0) + matrix[x][y];
                        sumR[y - c] += sumR[y -c];
                        max = Math.max(max, sumR[y - c]);
                    }
                }
            }
        }
        return max;
    }
    */

}