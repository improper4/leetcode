public class MultiplyString {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int n1 = num1.length();
        int n2 = num2.length();
        int[] arr = new int[n1 + n2-1];
        for(int i = 0; i < n1; i++){
            for(int j = 0, idx = i; j < n2; j++){
                arr[idx++] += ((num1.charAt(i)-'0') * (num2.charAt(j) -'0'));
            }
        }
        for(int i = arr.length -1; i > 0; i--){
            arr[i -1] += (arr[i] / 10);
            arr[i] %= 10;
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}