import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        // 실패한 사람들
        int[] fail = new int[N+1];
        
        for(int stage : stages){
            if(stage == N+1)    continue;
            fail[stage]++;
        }
        
        // 도전자 수
        int[] challenger = new int[N+1];
        
        challenger[1] = stages.length;
        
        for(int i=2; i<=N; i++){
            challenger[i] = challenger[i-1] - fail[i-1];
        }
        
        // 실패율
        double[] failrate = new double[N+1];
        Set<Double> fails = new HashSet<Double>();
        
        for(int i=1; i<=N; i++){
            if(challenger[i] == 0)
                failrate[i] = 0;
            else 
                failrate[i] = (double)fail[i]/challenger[i];
            fails.add(failrate[i]);            
        }
        
        // 실패율 정렬 (오름차순, 뒤부터 조회)
        List<Double> faillist = new ArrayList<Double>(fails);
        Collections.sort(faillist);
        
        int[] answer = new int[N];
        
        int index = N-1;
        
        for(int i=0; i<faillist.size(); i++){
            double rate = faillist.get(i);
            
            for(int j=failrate.length-1; j>0; j--){
                if(rate == failrate[j]){
                    answer[index] = j;
                    index--;
                }
            }
        }
        
        return answer;
    }
}