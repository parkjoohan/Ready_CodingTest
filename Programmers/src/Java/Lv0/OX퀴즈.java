import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<quiz.length; i++) {
            String[] s = quiz[i].split(" ");
            
            if(s[1].equals("-")) {
                if(Integer.parseInt(s[4]) == Integer.parseInt(s[0]) - Integer.parseInt(s[2]))
                    list.add("O");
                else
                    list.add("X");
            } else if(s[1].equals("+")) {
                if(Integer.parseInt(s[4]) == Integer.parseInt(s[0]) + Integer.parseInt(s[2]))
                    list.add("O");
                else
                    list.add("X");
            }
        }
        
        String[] answer = new String[list.size()];
        for(int i=0; i<answer.length; i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}