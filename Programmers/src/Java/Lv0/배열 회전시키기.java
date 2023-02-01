package Java.Lv0;

import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp = 0;
        
        if(direction.equals("right")) {
            temp = numbers[numbers.length-1];
            list.add(temp);
            for(int i=0; i<numbers.length-1; i++)
                list.add(numbers[i]);
        } else {
            temp = numbers[0];
            for(int i=1; i<numbers.length; i++)
                list.add(numbers[i]);
            list.add(temp);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}