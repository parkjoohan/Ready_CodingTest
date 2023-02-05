package Java.Lv0;

class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        
        answer = fac(balls, share);
        
        return answer;
    }
    
    public static int fac(int n, int m) {
        if(m==0 || n==m)
            return 1;
        else 
            return fac(n-1,m-1) + fac(n-1,m);
    }
}