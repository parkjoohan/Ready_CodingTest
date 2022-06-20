import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int match=0;
        int not_match=0;
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        // 알아보지 못하는 번호
        for(int i=0; i<lottos.length; i++){
            if(lottos[i]==0){
                not_match++;
                continue;
            }
            
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i]==win_nums[j]){
                    match++;
                    break;
                }
            }
        }
        
        // 알아보지 못하는 번호, 모두 당첨 번호와 일치
        answer[0] = get(match+not_match);
        // 알아보지 못하는 번호, 모두 당첨 번호와 불일치
        answer[1] = get(match);
        
        return answer;
    }
    
    public static int get(int n){
        switch(n){
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}