class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(true) {
            if(n<a)
                break;
            
            answer += b * (n/a);
            n = (n/a)*b + n%a;
        }
        
        return answer;
    }
}