package Java.Lv0;

class Solution {
    public int solution(int n) {
        int answer = 1;
        int pizza = 6;
        
        while(true) {
            
            if(pizza%n==0)
                break;
            else {
                answer++;
                pizza+=6;
            }
        }
        
        return answer;
    }
}
