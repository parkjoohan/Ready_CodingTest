import java.util.*;

class Solution {
    
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int[][] visited;             // 방문 체크
    static ArrayList<Integer> list;     // 영역별 넓이 저장 list
    static int cnt, max;                // 탐색하고 있는 영역의 넓이, 전체 영역 넓이 중 최대값
    public int[] solution(int m, int n, int[][] picture) {
        int[] answer = new int[2];
        visited = new int[m][n];
        list = new ArrayList<>();
        max=0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                //색깔이 있고 방문하지 않은 영역 찾기
                if(picture[i][j]!=0 && visited[i][j]==0){
                    cnt=1;
                    dfs(i, j, m, n, picture);
                    // 영역 탐색 완료 후 max, list에 저장
                    max = Math.max(max, cnt);
                    list.add(max);
                }
            }
        }
        
        answer[0]=list.size();
        answer[1]=max;
        
        return answer;
    }
    
    public void dfs(int x, int y, int m, int n, int[][] picture){
        
        // 방문했음을 표시
        visited[x][y] = picture[x][y];
        
        // 동서남북 갈 수 있는 좌표 계산
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            // 범위초과 && 방문했던 곳은 패스
            if(nx<0 || nx>=m || ny<0 || ny>=n || visited[nx][ny]!=0)
                continue;
            
            // 현재 탐색 영역과 색깔이 같다면
            if(picture[nx][ny] == picture[x][y]){
                cnt++;
                dfs(nx, ny, m, n, picture);
            }
        }
    }
}