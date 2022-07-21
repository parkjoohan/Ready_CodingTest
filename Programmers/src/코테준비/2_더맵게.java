import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer = 0;
        
        for(int i : scoville)
            pq.offer(i);
        
        while(pq.peek()<K){
            if(pq.size()<=1)
                return -1;
            
            int min = pq.poll();
            int min2 = pq.poll();
            
            int sum = min + (min2*2);
            pq.offer(sum);
            answer++;
        }
        
        return answer;
    }
}