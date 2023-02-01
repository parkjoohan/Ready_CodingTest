package Java.Lv0;

import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] array = my_string.toLowerCase().toCharArray();
        
        Arrays.sort(array);
        
        for(int i=0; i<array.length; i++)
            answer += array[i];
        
        return answer;
    }
}