package Java.Lv0;

import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        
        for(int num : array)
            max = Math.max(max, num);
        
        answer[0] = max;
        answer[1] = Arrays.binarySearch(array, max);
        return answer;
    }
}