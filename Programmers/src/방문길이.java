class Solution {
    static int answer = 0;
    static int x, y;    // 현재 좌표
    static int nx, ny;  // 이동할 좌표
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static boolean[][][][] visited = new boolean[11][11][11][11];
    public int solution(String dirs) {
        x=5; y=5; nx=5; ny=5;
        
        for(char move : dirs.toCharArray()){
            x = nx;
            y = ny;
            
            // 상하좌우
            if(move == 'L'){
                nx = x + dx[0];
                ny = y + dy[0];
            } else if(move == 'D'){
                nx = x + dx[1];
                ny = y + dy[1];
            } else if(move == 'R'){
                nx = x + dx[2];
                ny = y + dy[2];
            } else {
                nx = x + dx[3];
                ny = y + dy[3];
            } 
            
            // 범위 벗어났을 때
            if(nx<0 || nx>10 || ny<0 || ny>10){
                nx = x;
                ny = y;
                continue;
            }
            
            // 이동 가능한 좌표, 첫방문이면 답 +1
            if(!visited[x][y][nx][ny]){
                visited[x][y][nx][ny]=true;
                visited[nx][ny][x][y]=true;
                answer++;
            }
        }
        
        return answer;
    }
}