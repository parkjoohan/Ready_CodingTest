import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(m,n);
        int min = Math.min(m,n);
        
        answer[0] = func(max, min);
        answer[1] = max * min / answer[0];
        
        return answer;
    }
    
    public static int func(int x, int y){
        if(x%y==0)
            return y;
        
        return func(y, x%y);
    }
}