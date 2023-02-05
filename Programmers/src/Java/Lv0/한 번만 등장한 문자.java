package Java.Lv0;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int[] str = new int[26];
        
        for(int i=0; i<s.length(); i++) {
            int num = (int)s.charAt(i);
            str[num-97]++;
        }
        
        for(int i=0; i<str.length; i++) {
            if(str[i]==1)
                sb.append((char)(i+97));
        }
        
        return sb.toString();
    }
}