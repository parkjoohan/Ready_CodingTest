import java.util.*;

class Solution {
    
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static int[][] visited;
    public int solution(int[][] maps) {
        int answer = 0;
        visited = new int[maps.length][maps[0].length];
        
        // 시작 위치 방문 체크
        visited[0][0]=1;
        
        // bfs 탐색
        bfs(maps, visited);
        
        // 도착지 값
        answer = visited[maps.length-1][maps[0].length-1];
        
        // 끝까지 못 가는 경우
        if(answer == 0)
            answer = -1;
        
        return answer;
    }
    
    public void bfs(int[][] maps, int[][] visited){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        
        while(!q.isEmpty()){
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];
            
            // 동서남북 검색
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // 범위 벗어나는지, 방문했는지, 갈 수 있는지 확인
                if(nx>=0 && nx<maps.length && ny>=0 && ny<maps[0].length && visited[nx][ny]==0 && maps[nx][ny]==1){
                    // 방문 처리하기
                    visited[nx][ny] = visited[x][y]+1;
                    q.add(new int[]{nx, ny});
                }
            }
        }
    }
}