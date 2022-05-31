class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        
        for(int i=1; i<=count; i++){
            sum += price * i;
        }
        
        answer = sum - money;
        
        if(answer <= 0)
            return 0;
        
        return answer;
    }
}

// javascript
//function solution(price, money, count) {
//    var answer = 0;
//    
//    for(let i=1; i<=count; i++){
//        answer += (price * i);
//    }
//    
//    let result = answer - money;
//    if(result < 0)  result = 0;
//    return result;
//}