class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=2; i<=n; i++){
            boolean flag = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                // 나누어떨어지면 소수X
                if(i%j==0){
                    // flag를 false로 바꿔서 소수가 아니라고 체크
                    flag = false;
                    break;
                }
            }
            
            // 소수인 숫자는 flag가 변하지 않고 true 
            if(flag==true)
                answer++;
        }
        
        return answer;
    }
}