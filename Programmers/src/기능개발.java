import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        // 남은 작업일수를 저장할 큐
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<speeds.length; i++){
            // 남은 작업일을 계산하여 큐에 추가
            q.offer((100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] == 0 ? 0 : 1));
        }
        
        // 현재 카운트 1
        int cnt=1;
        // 첫번째 항목 꺼냄
        int now = q.poll();
        // 결과를 담는 배열
        ArrayList<Integer> list = new ArrayList<>();
        
        while(!q.isEmpty()){
            // 현재 작업일과 다른 작업일 비교값
            int next = q.poll();
            // 현재 작업일이 더 많은 경우 cnt++
            if(next<=now)
                cnt++;
            // 현재 작업일이 더 작은 경우
            else {
                // 배열에 계산한 cnt 추가
                list.add(cnt);
                // 현재 작업일 next로 변경
                now = next;
                // cnt 초기화
                cnt=1;
            }
        }
        
        // 마지막 cnt는 추가되지 않아 따로 추가
        list.add(cnt);
        
        // ArrayList를 배열로 변환  
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}