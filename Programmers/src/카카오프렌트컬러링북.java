import java.util.*;
/**
 *
 * @author HEESOO
 *
 */
class Solution {
    int[][] visit; // 방문 체크 배열
    ArrayList<Integer> list; // 영역별 넓이 저장
    int cnt, max; // 탐색하고 있는 영역의 넓이, 전체 영역 넓이 중 최대값
    int[] dotX={0,1,0,-1};
    int[] dotY={1,0,-1,0};
    public int[] solution(int m, int n, int[][] picture) {
        int[] answer = new int[2];
        
        visit=new int[m][n];
        list=new ArrayList<>();
        max=0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                // 색깔이 있고 방문하지 않는 곳이면 해당 영역 찾기
                if(picture[i][j]!=0 && visit[i][j]==0){
                    cnt=1;
                    dfs(i, j, m, n, picture);
                    // 영역 탐색 완료 후 max, list에 값 저장
                    max=Math.max(max, cnt);
                    list.add(cnt);
                }
            }
        }        
        
        answer[0] = list.size();
        answer[1] = max;
        return answer;
    }
    
    public void dfs(int x, int y, int m, int n, int[][] picture){
        // 방문했음을 표시
        visit[x][y]=picture[x][y]; 
        
        // 사방으로 갈 수 있는 좌표 계산
        for(int i=0;i<4;i++){ 
            int xx=x+dotX[i];
            int yy=y+dotY[i];
            
            // 범위 초과
            if(xx<0 || xx>=m || yy<0 || yy>=n) continue;
            // 방문한 곳이면 패스 
            if(visit[xx][yy]!=0) continue; 
            // 현재 탐색 영역과 색깔이 같다면
            if(picture[xx][yy]==picture[x][y]){ 
                cnt++;
                dfs(xx, yy, m, n, picture); // 이동
            }
        }
    }
}