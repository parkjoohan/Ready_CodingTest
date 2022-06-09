class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<right+1; i++){
            int cnt=0;
            for(int j=1; j<=i; j++){
                if(i%j==0)
                    cnt++;
            }
            
            if(cnt%2==0)
                answer+=i;
            else
                answer-=i;
        }
        return answer;
    }
}

//// javascript
//function solution(left, right) {
//    var answer = 0;
//    
//    for(let i=left; i<=right; i++){
//        let array = []; 
//        
//        for(let j = 0; j <= i; j++) { 
//            if(i % j === 0) array.push(j) 
//        } 
//        array.length % 2 === 0 ? answer += i : answer -= i
//    }
//    return answer;
//}