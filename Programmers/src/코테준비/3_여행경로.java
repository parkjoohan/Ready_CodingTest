import java.util.*;

class Solution {
    static boolean[] visited;
    static ArrayList<String> answers;
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        answers = new ArrayList<>();
        int cnt = 0;
        
        dfs(tickets, cnt, "ICN", "ICN");
        Collections.sort(answers);
        
        String[] answer = answers.get(0).split(" ");
        return answer;
    }
    
    public void dfs(String[][] tickets, int cnt, String present, String answer) {
        if(cnt==tickets.length){
            answers.add(answer);
            return;
        }
        
        for(int i=0; i<tickets.length; i++) {
            if(!visited[i] && tickets[i][0].equals(present)) {
                visited[i]=true;
                dfs(tickets, cnt+1, tickets[i][1], answer+" "+tickets[i][1]);
                visited[i]=false;
            }
        }
    }
}