import java.util.*;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int answer = 0;
        
        for(int i=1; i<n+1; i++){
            if(n%i==0)
                list.add(i);
        }
        
        for(int i=0; i<list.size(); i++){
            answer += list.get(i);
        }
        
        return answer;
    }
}