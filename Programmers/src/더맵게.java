import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue();
        
        for(int i : scoville)
            pq.offer(i);
        
        while(pq.peek()<K){
            if(pq.size()<=1)
                return -1;
            
            int min = pq.poll();
            int min2 = pq.poll();
            
            int sum = min + min2 * 2;
            pq.offer(sum);
            answer++;
        }
        return answer;
    }
}