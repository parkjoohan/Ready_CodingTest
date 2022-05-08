import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = 9999;
        int[][] connect = new int[n+1][n+1];
        boolean[] visited = new boolean[n+1];
        int cnt = 0;
        
        // 연결된 송전탑 체크
        for(int i=0; i<wires.length; i++){
            connect[wires[i][0]][wires[i][1]] = 1;
            connect[wires[i][1]][wires[i][0]] = 1;
        }
        
        // 전력망 분할
        for(int i=0; i<wires.length; i++){
            // 끊기
            connect[wires[i][0]][wires[i][1]] = 0;
            connect[wires[i][1]][wires[i][0]] = 0;
            
            // 초기화
            cnt = 0;
            visited = new boolean[n+1];
            
            // BFS
            Queue<Integer> q = new LinkedList<>();
            q.add(1);
            visited[1] = true;
            while(!q.isEmpty()){
                int start = q.poll();
                cnt++;
                
                for(int j=1; j<=n; j++){
                    if(connect[start][j] == 1 && !visited[j]){
                        q.add(j);
                        visited[j] = true;
                    }
                }
            }
            
            // 다시 연결
            connect[wires[i][0]][wires[i][1]] = 1;
            connect[wires[i][1]][wires[i][0]] = 1;
            
            int tower = Math.abs(n-cnt*2);
            if(answer > tower)  answer = tower;
        }
        
        return answer;
    }
}