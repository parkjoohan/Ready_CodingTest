package Java.Lv0;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=10; i++){
            if(n >= fac(i))
                answer = i;
            else
                break;
        }
        
        return answer;
    }
    
    public static int fac(int num) {
        if(num > 1)
            return num * fac(num-1);
        
        return num;
    }
}