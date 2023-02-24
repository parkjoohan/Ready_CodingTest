import java.util.*;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int answer = 0;
        
        while(n!=0) {
            list.add(n%3);
            n/=3;
        }
        
        int num = 1;
        for(int i=list.size()-1; i>=0; i--) {
            answer += list.get(i) * num;
            num *= 3;
        }
        
        return answer;
    }
}