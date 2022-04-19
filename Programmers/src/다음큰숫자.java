class Solution {
    public int solution(int n) {
        int answer = 0;
        String binary = Integer.toBinaryString(n);
        int cnt=0;
        
        for(int i=0; i<binary.length(); i++){
            if(binary.charAt(i)=='1')
                cnt++;
        }
        
        for(int i=n+1; ; i++){
            String temp = Integer.toBinaryString(i);
            int nextcnt = 0;
            for(int j=0; j<temp.length(); j++){
                if(temp.charAt(j)== '1')
                    nextcnt++;
            }
            
            if(nextcnt == cnt){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}