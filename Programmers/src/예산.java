import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for(int i=0; i<d.length; i++){
            
            if(budget >= d[i]){
                budget -= d[i];
                answer++;
            } else {
                break;
            }
        }
        
        return answer;
    }
}

// javascript
//function solution(d, budget) {
//    var answer = 0;
//    
//    d.sort((a, b) => a-b);
//    
//    for(let i=0; i<d.length; i++){
//        if(budget < d[i]) break;
//        else {
//            budget -= d[i];
//            answer++;
//        }
//    }
//    return answer;
//}