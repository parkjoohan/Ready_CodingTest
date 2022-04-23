class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int area = brown + yellow;
        
        for(int i=1; i<=area; i++){
            int row=i;
            int col=area/row;
            
            // 카펫의 가로 길이는 >= 세로 길이
            if(row>col) continue;
            
            if((row-2)*(col-2)==yellow){
                answer[0] = col;
                answer[1] = row;
                return answer;
            }
        }
        return answer;
    }
}