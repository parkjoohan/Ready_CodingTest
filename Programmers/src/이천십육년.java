class Solution {
    public String solution(int a, int b) {
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
        int sum=0, result=0;
        
        for(int i=0; i<a-1; i++){
            sum += days[i];
        }
        sum += (b-1);
        result = sum%7;
        
        return day[result];
    }
}