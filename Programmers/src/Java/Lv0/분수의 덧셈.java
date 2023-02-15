class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int up = (numer1*denom2) + (numer2*denom1);
        int down = denom1 * denom2;
        
        for(int i=up-1; i>1; i--) {
            if(up%i==0 && down%i==0) {
                up /= i;
                down /= i;
            }
        }
        
        int[] answer = {up, down};
        return answer;
    }
}