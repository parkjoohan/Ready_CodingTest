class Solution {
    public int solution(String s) {
        int answer = 0;
        
        if(s.length() == 1) return 1;
        
        // 1 ~ N/2+1 중에 문자열을 몇 개 단위로 자를지 반복
        for(int i=1; i<s.length()/2 + 1; i++){
            String target = s.substring(0, i);
            String done = "";
            String current = "";
            int cnt = 1;
            
            // N개 단위로 자르면 그 다음 N개와 비교
            for(int j=i; j<s.length(); j+=i){
                // 남은 문자열이 N개보다 작을 때는 압축 불가능하므로 누적하고 끝냄
                if(j+i > s.length()){
                    done += s.substring(j, s.length());
                } 
                // 남은 문자열이 N개 이상일 경우는 다음 N글자와 비교 후 반복횟수 증가 또는 반복대상 변경
                else {
                    current = s.substring(j, j+i);
                    if(current.equals(target)){
                        cnt++;
                    } else {
                        done += ((cnt == 1 ? "" : cnt+ "") + target);
                        target = s.substring(j, j+i);
                        cnt=1;
                    }
                }
            }
            
            // 순서는 상관없으므로
            // 반복횟수와 대상(마지막으로 반복된 대상), 이미 압축되었거나 압축되지 못하는 문자열들을 합침
            String result = (cnt == 1 ? "" : cnt + "") + target + done;
            
            // N개 단위 중 어떤 문자열이 가장 짧은지 비교하여 최소값 구함
            if (answer == 0) {
                answer = result.length();
            }
            if (result.length() < answer) {
                answer = result.length();
            }
        }
        return answer;
    }
}