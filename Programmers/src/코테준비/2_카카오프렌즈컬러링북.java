import java.util.*;

class Solution {
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};
    static int[][] visited;
    static ArrayList<Integer> list;
    static int cnt, max;
    public int[] solution(int m, int n, int[][] picture) {
        int[] answer = new int[2];
        visited = new int[m][n];
        list = new ArrayList<>();
        max = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(picture[i][j]!=0 && visited[i][j]==0){
                    cnt=1;
                    dfs(i,j,m,n,picture);
                    max = Math.max(max, cnt);
                    list.add(max);
                }
            }
        }
        
        answer[0]=list.size();
        answer[1]=max;
        
        return answer;
    }
    
    public void dfs(int x, int y, int m, int n, int[][] picture) {
        visited[x][y]=picture[x][y];
        
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx<0 || ny<0 || nx>=m || ny>=n || visited[nx][ny]!=0)
                continue;
            
            if(picture[nx][ny] == picture[x][y]) {
                cnt++; 
                dfs(nx, ny, m, n, picture);
            }
        }
    }
}