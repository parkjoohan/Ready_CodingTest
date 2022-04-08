import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String s2 = s.toLowerCase();
        char last = ' ';
        
        for(char c : s2.toCharArray()){
            if(last == ' ') c = Character.toUpperCase(c);
            answer += c;
            last = c;
        }
        
        return answer;
    }
}