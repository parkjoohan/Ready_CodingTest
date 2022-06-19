class Solution {

    public int solution(int[] arr) {
        int num = lcm(arr[0], arr[1]);
        int answer = 0;
        
        for(int i=2; i<arr.length; i++){
            answer = lcm(num, arr[i]);
            num = answer;
        }
        
        return answer;
    }
    
    public int gcd(int a, int b) {
        while(b!=0){
            int r = a%b;
            a=b;
            b=r;
        }
        
        return a;
    }
    
    public int lcm(int a, int b) {
        return (a*b)/gcd(a,b);
    }
}