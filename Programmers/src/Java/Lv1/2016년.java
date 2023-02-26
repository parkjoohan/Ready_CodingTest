class Solution {
    public String solution(int a, int b) {
        String[] month = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month_day = {31,29,31,30,31,30,31,31,30,31,30,31}; 
        String answer = "";
        int sum = 0;
        
        for(int i=0; i<a-1; i++) {
            sum += month_day[i];
        }
        
        sum += b - 1;
        sum %= 7;
        
        answer = month[sum];
        
        return answer;
    }
}