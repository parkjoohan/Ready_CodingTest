class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        
        for(int i=0; i<computers.length; i++){
            if(!visited[i]){
                dfs(computers, visited, i);
                answer++;
            }
        }
        return answer;
    }
    
    public void dfs(int[][] computers, boolean[] visited, int start) {
        visited[start] = true;
        
        for(int i=0; i<computers[start].length; i++){
            if(computers[start][i]==1 && visited[i]==false)
                dfs(computers, visited, i);
        }
    }
}