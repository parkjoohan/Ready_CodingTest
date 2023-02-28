import java.util.*;

class Solution {
    static int[] first = {1,2,3,4,5};
    static int[] second = {2,1,2,3,2,4,2,5};
    static int[] third = {3,3,1,1,2,2,4,4,5,5};
    public int[] solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] number = {0,0,0};
        int num1 = 0, num2 = 0, num3 = 0;
        
        for(int i=0; i<answers.length; i++) {
            if(first[i%5]==answers[i]) number[0]++;
            if(second[i%8]==answers[i]) number[1]++;
            if(third[i%10]==answers[i]) number[2]++;
        }
        
        int max = Math.max(number[0], Math.max(number[1], number[2]));
        
        for(int i=0; i<number.length; i++)
            if(max == number[i])
                list.add(i+1);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}