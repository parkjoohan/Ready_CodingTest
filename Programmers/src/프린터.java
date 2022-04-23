import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 1;
        
        // 우선순위 큐에 문서 우선순위 저장 (우선 순위 내림차순 정렬)
        for(int i=0; i<priorities.length; i++){
            pq.offer(priorities[i]);
        }
        
        // 우선순위 높은 순으로 기존 배열에서 일치하는 문서 찾기
        while(!pq.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(priorities[i] == pq.peek()){
                    // PriorityQueue에서 읽은 요소가 Location에 위치한 요소일 경우 출력순서 리턴
                    if(i == location){
                        return answer;
                    }
                    answer++;
                    pq.poll();  // 값을 찾았을 때만 큐에서 빼야함
                }
            }
        }
        
        return answer;
    }
}