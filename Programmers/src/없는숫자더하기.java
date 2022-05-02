import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 45; 
        
        for(int number : numbers) {
            answer -= number;
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