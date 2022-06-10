class Solution {
    public int solution(int num) {
        long number=num;
        int cnt=0;
        
        while(number!=1){
            if(number%2==0){
                number/=2;
                cnt++;
            }
            else if(number%2!=0){
                number = number*3+1;
                cnt++;
            }
            if(cnt>500){
                return -1;
            }
        }
        return cnt;
    }
}