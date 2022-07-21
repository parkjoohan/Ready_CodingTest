class Solution {
    static int x, y, nx, ny;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static boolean[][][][] visited = new boolean[11][11][11][11];
    public int solution(String dirs) {
        int answer = 0;
        x=5; y=5; nx=5; ny=5;
        
        for(char ch : dirs.toCharArray()){
            x = nx;
            y = ny;
            
            if(ch == 'L'){
                nx = x + dx[0];
                ny = y + dy[0];
            } else if(ch == 'D'){
                nx = x + dx[1];
                ny = y + dy[1];
            } else if(ch == 'R'){
                nx = x + dx[2];
                ny = y + dy[2];
            } else {
                nx = x + dx[3];
                ny = y + dy[3];
            }
            
            if(nx<0 || ny<0 || nx>10 || ny>10){
                nx=x;
                ny=y;
                continue;
            }
            
            if(!visited[x][y][nx][ny]){
                visited[x][y][nx][ny]=true;
                visited[nx][ny][x][y]=true;
                answer++;
            }
        }
        
        return answer;
    }
}