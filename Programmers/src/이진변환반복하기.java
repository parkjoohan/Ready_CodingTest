class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(s.length()>1){
            // 문자열 길이
            int cnt=0;
            
            for(int i=0; i<s.length(); i++){
                // 0이 있으면 제거한 개수 +
                if(s.charAt(i)=='0')
                    answer[1]++;
                // 0이 아니면 그냥 문자열 길이 +
                else
                    cnt++;
            }
            
            // 문자열 길이를 이진으로 바꾸기
            s = Integer.toBinaryString(cnt);
            answer[0]++;
        }
        
        return answer;
    }
}