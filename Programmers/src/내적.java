class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i=0; i<a.length; i++){
            answer += a[i] * b[i];
        }
        
        return answer;
    }
}

//javascript
//function solution(a, b) {
//    var answer = 0;
//    
//    for(let i=0; i<a.length; i++){
//        answer += (a[i] * b[i]);
//    }
//    
//    return answer;
//}