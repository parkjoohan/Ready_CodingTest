import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                sum = numbers[i] + numbers[j];
                if(!list.contains(sum))
                    list.add(sum);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}

////javascript
//function solution(numbers) {
//    var answer = [];
//    
//    for(let i=0; i<numbers.length; i++){
//        for(let j=i+1; j<numbers.length; j++){
//            let sum = numbers[i] + numbers[j];
//            if(answer.indexOf(sum) === -1){
//                answer.push(sum);
//            }
//        }
//    }
//    answer.sort((a,b) => a-b);
//    
//    return answer;
//}