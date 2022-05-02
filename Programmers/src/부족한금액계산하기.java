class Solution {
    public long solution(int price, int money, int count) {
        long result = 0, sum = 0;
        
        for(int i=1; i<=count; i++) {
            sum += price * i;
        }

        result = sum - money;
        if(result <= 0) return 0;
        return result;
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