package Java.Lv0;

class Solution {
    public int solution(int num, int k) {
        String str = Integer.toString(num);
        String str2 = Integer.toString(k);
        
        return str.indexOf(str2)==-1 ? -1 : str.indexOf(String.valueOf(k))+1;
    }
}