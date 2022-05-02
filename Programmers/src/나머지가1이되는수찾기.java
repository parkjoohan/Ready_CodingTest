class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<n; i++){
            if(n%i==1){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}

//// javascript
//function solution(n) {
//    var answer = 0;
//    
//    for(let i=2; i<n; i++){
//        if(n%i===1) return i;
//    }
//    
//    return answer;
//}