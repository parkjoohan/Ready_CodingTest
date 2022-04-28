class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] check = new boolean[n];
        
        for(int i=0; i<n; i++){
            if(!check[i]){
                dfs(computers, check, i);
                answer++;
            }
        }
        return answer;
    }
    
    public void dfs(int[][] computers, boolean[] check, int node){
        check[node] = true;
        
        for(int i=0; i<computers.length; i++){
            if(!check[i] && computers[node][i]==1){
                dfs(computers, check, i);
            }
        }
    }
}