class Solution {
    public int solution(String name) {
        int answer = 0;
        // 좌우 이동 최대 횟수
        int move = name.length()-1;
        
        for(int i=0; i<name.length(); i++){
            // 위로, 아래로 조작했을때 작은 이동 값을 answer에 더함
            answer += Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);
            
            // 좌우 비교
            int index=i+1;
            // 다음 요소 부터 연속된 A문자열 탐색
            while(index<name.length() && name.charAt(index)=='A')
                index++;
            
            // 순서대로 가는 것과 뒤로 돌아가는 것 중 이동 수가 작은 것을 선택
            move = Math.min(move, i*2+name.length()-index);
            
            // BBBBAAAAAAAAB와 같이 처음부터 뒷부분을 먼저 입력하는 것이 더 빠른 경우까지 고려하면 아래 코드도 필요
            move = Math.min(move, (name.length()-index)*2+i);
        }
        
        return answer+move;
    }
}