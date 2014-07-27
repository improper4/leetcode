public class ContainMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0, j = height.length -1;
        while(i < j){
            int tmp = (j -i) * Math.min(height[i], height[j]);
            max = Math.max(tmp, max);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}