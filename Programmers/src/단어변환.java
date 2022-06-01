class Solution {
    static boolean[] visit;
    static int answer = 0;
    
    public int solution(String begin, String target, String[] words) {
        visit = new boolean[words.length];
        
        dfs(begin, target, words, 0);
        
        return answer;
    }
    
    public static void dfs(String begin, String target, String[] words, int cnt) {
        
        // 원하는 단어와 같아지면
        if(begin.equals(target)){
            answer = cnt;
            return;
        }
        
        for(int i=0; i<words.length; i++){
            // 이미 쓴 단어는 넘어가기
            if(visit[i])
                continue;
            
            // 단어끼리 다른 개수 찾기
            int k=0;
            for(int j=0; j<begin.length(); j++){
                if(begin.charAt(j) != words[i].charAt(j))
                    k++;
            }
            
            // 다른게 1개라면 탐색
            // 다른 단어 개수가 1개면 변환 가능한 단어이므로 단어 탐색한 것으로 표기하고 dfs 탐색 실시
            if(k==1){
                visit[i]=true;
                dfs(words[i], target, words, cnt+1);
                visit[i]=false;
            }
            
        }
    }
}