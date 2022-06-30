class Solution {
    public String solution(int a, int b) {
        String[] day = new String[] {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] days = new int[] {31,29,31,30,31,30,31,31,30,31,30,31};
        
        String answer = "";
        int num=0;
        
        for(int i=0; i<a-1; i++){
            num+=days[i];
        }
        
        num+=(b-1);
        num=num%7;
        
        return day[num];
    }
}