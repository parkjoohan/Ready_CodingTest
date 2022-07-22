import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> q = new LinkedList<>();
        int sum = 0;
        int answer = 0;
        
        for(int i : truck_weights) {
            while(true) {
                if(q.isEmpty()) {
                    q.offer(i);
                    sum+=i;
                    answer++;
                    break;
                }
                
                else if(q.size() == bridge_length) 
                    sum -= q.poll();
                
                else {
                    if(sum+i>weight){
                        q.offer(0);
                        answer++;
                    }
                    else {
                        q.offer(i);
                        sum+=i;
                        answer++;
                        break;
                    }
                }
            }
        }
        
        return answer+bridge_length;
    }
}