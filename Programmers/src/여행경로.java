import java.util.*;

class Solution {
    
    boolean[] visited;
    ArrayList<String> answers;
    
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        answers = new ArrayList<>();
        int cnt = 0;
        
        dfs(cnt, "ICN", "ICN", tickets);
        Collections.sort(answers);  // 답 중 알파벳순 정렬
        
        // 가장 빠른 배열 뽑아서 String형 배열 전환
        String[] answer = answers.get(0).split(" "); 
        return answer;
    }
    
    public void dfs(int cnt, String present, String answer, String[][] tickets){
        
        // 모든 공항 들른 뒤
        if(cnt == tickets.length){
            answers.add(answer);
            return;
        }
        
        for(int i=0; i<tickets.length; i++){
            if(!visited[i] && tickets[i][0].equals(present)){
                visited[i] = true;
                dfs(cnt+1, tickets[i][1], answer+" "+tickets[i][1], tickets);
                visited[i] = false;
            }
        }
        
        return;
    }
}