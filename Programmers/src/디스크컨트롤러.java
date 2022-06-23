import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        // 처리시간 순서대로
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1]-o2[1]);
        // 시작시간 순서대로
        Arrays.sort(jobs, (o1, o2) -> o1[0]-o2[0]);
        
        int answer = 0;
        // 현재시간
        int current = 0;
        int i=0;
        
        while(i<jobs.length || !pq.isEmpty()){
            // 현재 시간보다 작거나 같은 요청시점을 큐에 추가
            while(i<jobs.length && jobs[i][0]<=current)
                pq.offer(jobs[i++]);
            
            // 큐에 작업이 없다면
            if(pq.isEmpty())
                // 작업 요청시점이 가장 빠른 작업 추가
                current = jobs[i][0];
            // 큐에 작업이 있다면
            else {
                // 작업 소요시간이 가장 빠른 작업 수행
                int[] job = pq.poll();
                current+=job[1];
                answer+=current-job[0];
            }
        }
        return answer/jobs.length;
    }
}