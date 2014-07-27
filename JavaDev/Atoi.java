public class Atoi {
    public int atoi(String str) {
        boolean neg = false;
        boolean space = false;
        boolean plus = false;
        int idxb=0;
        int idxe=str.length()-1;
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i)>='0' && str.charAt(i)<='9') {
                idxb=i;
                while (i<str.length()) {
                    if (str.charAt(i)<'0' || str.charAt(i)>'9') {
                        break;
                    }
                    i++;
                }
                idxe = i-1;
                break;
            } else if (str.charAt(i)==' ') {
                if (neg || plus) return 0;
                space = true;
            } else if (str.charAt(i) == '-') {
                if (neg || plus) return 0;
                neg = true;
            } else if (str.charAt(i) == '+') {
                if (neg || plus) return 0;
                plus = true;
            } else {
                return 0;
            }
        }
        int size = idxe-idxb+1;
        char[] arr = str.substring(idxb,idxe+1).toCharArray();
        long sum=0;
        for (int i=size-1;i>=0;i--) {
            int idx = size-1-i;
            sum += (arr[idx]-48)*Math.pow(10,i);
        }
        if (neg) {
            if (sum>Integer.MAX_VALUE) return Integer.MIN_VALUE;
            return (0-(int) sum);
        }
        if (sum>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int) sum;
    }
}