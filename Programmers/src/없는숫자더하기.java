import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
                
        for(int i=0; i<numbers.length; i++){
            answer -= numbers[i];
        }
        
        return answer;
    }
}

//// javascript
//function solution(numbers) {
//    var answer = 0;
//    
//    for(let i=0; i<10; i++){
//        if(!numbers.includes(i)) answer += i;
//    }
//    
//    return answer;
//}