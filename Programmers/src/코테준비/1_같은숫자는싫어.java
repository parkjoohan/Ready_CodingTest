import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int exam=10;
        
        for(int num : arr){
            if(exam != num)
                list.add(num);
            exam = num;
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++)
            answer[i]=list.get(i);

        return answer;
    }
}