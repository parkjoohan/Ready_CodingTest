package Java.Lv0;

class Solution {
    public int solution(String s) {
        String[] str = s.split(" ");
        int answer = Integer.valueOf(str[0]);
        
        for(int i=1; i<str.length; i++) {
            if(str[i].equals("Z")) {
                answer -= Integer.valueOf(str[i-1]);
                continue;
            }
            
            answer += Integer.valueOf(str[i]);
        }
        
        return answer;
    }
}