class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        
        answer[0] = gcd(max, min);
        answer[1] = max*min/answer[0];
        
        return answer;
    }
    
    static int gcd(int x, int y){
        if(x%y==0){
            return y;
        }
        
        return gcd(y, x%y);
    }
}

// javascript
//function solution(n, m) {
//    var answer = [];
//    
//    const max = (a, b) => {
//        if(b==0)
//            return a
//        return max(b, a%b)
//    }
//    
//    const min = (a,b) => (a*b) / max(a,b)
//    return [max(n, m), min(n, m)]
//}