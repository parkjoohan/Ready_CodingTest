import java.util.*;

class Solution {
    
    boolean[] visited;
    boolean[][] connect;
    
    public int solution(int n, int[][] edge) {
        int answer = 0;
        visited = new boolean[n+1];
        connect = new boolean[n+1][n+1];
        
        answer = bfs(edge);
        return answer;
    }
    
    public int bfs(int[][] edge){
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        visited[1] = true;
        
        for(int i=0; i<edge.length; i++){
            int x = edge[i][0];
            int y = edge[i][1];
            
            connect[x][y] = true;
            connect[y][x] = true;
        }
        
        int size=0;
        
        while(!q.isEmpty()){
            size = q.size();
            
            for(int i=0; i<size; i++){
                int cur = q.poll();
                
                for(int j=1; j<visited.length; j++){
                    if(!visited[j] && connect[cur][j]){
                        visited[j] = true;
                        q.add(j);
                    }
                }
            }
        }
        return size;
    }
}
