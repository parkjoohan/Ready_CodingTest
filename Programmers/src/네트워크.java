class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        // 방문 여부 저장 
        boolean[] visited = new boolean[n];
        
        for(int i=0; i<computers.length; i++){
            // 해당 컴퓨터가 방문된 적이 없으면
            if(!visited[i]){
                // 해당 컴퓨터를 시작으로 방문 실행
                dfs(computers, visited, i);
                // 네트워크 하나가 탐색되었기 떄문에 카운트 +1
                answer++;
            }
        }
        return answer;
    }
    
    // 컴퓨터 연결정보 행렬, 컴퓨터 방문 여부, 시작 컴퓨터 
    void dfs(int[][] computers, boolean[] visited, int start){
        // 시작 컴퓨터 방문
        visited[start] = true;
        
        for(int i=0; i<computers[start].length; i++){
            // 시작 컴퓨터와 연결되어 있는 컴퓨터들을 새 시작저믕로 방문 명령
            if(computers[start][i]==1 && visited[i]==false)
                dfs(computers, visited, i);
        }
    }
}