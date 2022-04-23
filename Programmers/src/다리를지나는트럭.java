import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> q = new LinkedList<>();
        int sum = 0;
        
        for(int i : truck_weights){
            while(true){
                // 큐 비어있을 시 다음 트럭 삽입
                if(q.isEmpty()){
                    q.offer(i);
                    sum+=i;
                    answer++;
                    break;
                }
                
                // 큐의 사이즈와 다리의 길이가 같으면 큐에서 처음 값을 빼고 최대 무게
                else if(q.size() == bridge_length){
                    sum -= q.poll();
                }
                
                // 큐가 비어있지 않을 경우
                else {
                    
                    // 다음 트럭이 최대 무게 초과
                    if(sum+i>weight){
                        q.offer(0);
                        answer++;
                    }
                    
                    // 다음 트럭이 최대 무게 이내
                    else {
                        q.offer(i);
                        sum += i;
                        answer++;
                        break;
                    }
                }
            }
        }
        
        return answer + bridge_length;
    }
}