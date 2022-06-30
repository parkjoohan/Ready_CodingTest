import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] ans1 = {1, 2, 3, 4, 5};
        int[] ans2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] ans3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int result1=0, result2=0, result3=0;
        
        for(int i=0; i<answers.length; i++){
            if(ans1[i%5]==answers[i])
                result1++;
            if(ans2[i%8]==answers[i])
                result2++;
            if(ans3[i%10]==answers[i])
                result3++;
        }
        
        int max = Math.max(Math.max(result1, result2), result3);
        ArrayList<Integer> list = new ArrayList<>();
        
        if(max==result1)    list.add(1);
        if(max==result2)    list.add(2);
        if(max==result3)    list.add(3);
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}