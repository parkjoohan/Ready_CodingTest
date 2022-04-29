import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
   
        Arrays.sort(rocks);
        int left = 0;
        int right = distance;
        int mid = 0;
        
        while(left <= right){
            mid = (left + right) / 2;
            int prev = 0;   // 이전 바위
            int deletecnt = 0;   // 지운바위 수
            
            for(int i=0; i<rocks.length; i++){
                if(rocks[i]-prev < mid){
                    deletecnt++;
                    if(deletecnt>n)
                        break;
                }
                else {
                    prev = rocks[i];
                }
            }
            
            if(deletecnt>n)
                right = mid - 1;
            else{
                answer=answer > mid ? answer : mid;
                left = mid+1;
            }
                
        }
        return answer;
    }
}