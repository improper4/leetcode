public class RomanToInt {
    public int romanToInt(String s) {
        int[] map = new int[128];
        map['I'] = 1;
        map['V'] = 5;
        map['X'] = 10;
        map['L'] = 50;
        map['C'] = 100;
        map['D'] = 500;
        map['M'] = 1000;
        
        int len = s.length();
        int ans = map[s.charAt(len-1)];
        for(int i = len -2; i >= 0; i--){
            if(map[s.charAt(i)] < map[s.charAt(i+1)]){
                ans -= map[s.charAt(i)];
            }else{
                ans += map[s.charAt(i)];
            }
        }
        return ans;
    }
}