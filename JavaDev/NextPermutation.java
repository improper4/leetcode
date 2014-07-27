public class NextPermutation {
    void swap(int[] num, int a, int b){
        num[a] = num[a] ^ num[b];
        num[b] = num[a] ^ num[b];
        num[a] = num[a] ^ num[b];
    }
    void reverse(int[] num, int from, int to){
        while(from < to){
            swap(num, from++, to--);
        }
    }
    public void nextPermutation(int[] num) {
        int idx = num.length-1;
        while(idx != 0 && num[idx-1] >= num[idx]) idx--;
        if(idx == 0){
            reverse(num, 0, num.length -1);
            return;
        }
        idx--;
        int sec = idx+1;
        while(sec != num.length && num[sec] > num[idx]) sec++;
        sec--;
        swap(num, idx, sec);
        reverse(num, idx+1, num.length -1);
    }
}