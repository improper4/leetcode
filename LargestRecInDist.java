public class LargestRecInDist {
    public int largestRectangleArea(int[] h) {
        int max = 0;
        Stack<Integer> ss = new Stack<Integer>();
        int[] arr = Arrays.copyOf(h, h.length +1);
        for(int i = 0; i < arr.length; i++){
            while(!ss.isEmpty() && arr[ss.peek()] > arr[i]){
                max = Math.max(max, arr[ss.pop()] * (ss.isEmpty()? i: i -ss.peek() -1));
            }
            ss.push(i);
        }
        return max;
    }
    /*
    public int largestRectangleArea(int[] hist) {
        int len  = hist.length;
        int i,j,k;
        int maxSum=0,prev=-1;
    
        for(i=0;i<len;i++){
            if( prev == hist[i] ) continue;
    
            for(j=i-1;j>=0;j--)
                if(hist[j]<hist[i]) break;
    
            for(k=i+1;k<len;k++)
                if(hist[k]<hist[i]) break;
    
            //sum = height[i]+height[i]*(i-1-j)+height[i]*(k-(i+1)); sum = height[i]*(k-j-1)
            maxSum = Math.max( hist[i]*(k-j-1), maxSum);
            prev = hist[i];
        }
        return maxSum;
    }
    */
}