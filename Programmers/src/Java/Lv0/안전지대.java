class Solution {
    static int[] dx = {-1,0,1,0,-1,1,-1,1};
    static int[] dy = {0,1,0,-1,-1,-1,1,1};
    public int solution(int[][] board) {
        int answer = 0;
        boolean[][] visited = new boolean[board.length][board.length];
        
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                for(int k=0; k<8; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    
                    if(board[i][j]==1)  visited[i][j] = true;
                    if(nx>=0 && nx<board.length && ny>=0 && ny<board.length && board[nx][ny]==1) {
                        visited[i][j] = true;
                    }
                }
            }
        }
        
        for(int i=0; i<visited.length; i++) {
            for(int j=0; j<visited.length; j++) {
                if(!visited[i][j])
                    answer++;
            }
        }
        
        return answer;
    }
}