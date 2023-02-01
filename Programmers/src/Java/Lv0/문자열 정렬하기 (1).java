package Java.Lv0;

import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        char[] ch = my_string.toCharArray();

        for(int i=0; i<ch.length; i++) {
            if(Character.isDigit(ch[i]))
                list.add(Character.getNumericValue(ch[i]));
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) 
            answer[i] = list.get(i);

        Arrays.sort(answer);
        
        return answer;
    }
}