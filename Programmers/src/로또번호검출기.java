import java.util.*;

class Solution {
    public boolean solution(int[] lotto) {
        Set<Integer> set = new HashSet<>();
        boolean answer = true;
        
        for(int i=0; i<lotto.length; i++){
            set.add(lotto[i]);
        }
        
        if(set.size() == 6)   answer = true;
        else    answer=false;
        
        return answer;
    }
}