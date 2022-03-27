class Solution {
    public int solution(int num) {
        long arr = num;
        int cnt=0;
        
        while(arr!=1){
            if(arr%2==0)
                arr /= 2;
            else if(arr%2!=0) 
                arr = arr*3 +1;
            cnt++;
            
            if(cnt>500)
                return -1;
        }
        return cnt;
    }
}