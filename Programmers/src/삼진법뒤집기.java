import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        // 10진법 -> 3진법
        while(true) {
            if(n<3){
                list.add(n);
                break;
            }
            list.add(n%3);
            n=n/3;
        }
        
        // 3진법 -> 10진법
        for(int i=0; i<list.size(); i++){
            answer += (Math.pow(3, list.size()-i-1)*list.get(i));    
        }
        
        return answer;
    }
}