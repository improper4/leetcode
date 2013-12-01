public class SpiralMatrix {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(matrix.length == 0) return ans;
        
        int xstart = 0, xend = matrix.length -1;
        int ystart = 0, yend = matrix[0].length -1;
        
        while(true){
            for(int i = ystart; i <= yend; i++)
                ans.add(matrix[xstart][i]);
            if(++xstart > xend) break;
            
            for(int i = xstart; i <= xend; i++)
                ans.add(matrix[i][yend]);
            if(--yend < ystart) break;
            
            for(int i = yend; i >= ystart; i--)
                ans.add(matrix[xend][i]);
            if(--xend < xstart) break;
            
            for(int i = xend; i >= xstart; i--)
                ans.add(matrix[i][ystart]);
            if(++ystart > yend) break;
        }
        return ans;
    }
}