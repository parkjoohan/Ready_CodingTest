//import java.util.*;
//
//class Solution {
//    public int[] solution(int[] answers) {
//        int[] answer = {};
//        int[] p1 = {1, 2, 3, 4, 5};
//        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
//        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
//        int result1=0, result2=0, result3=0;
//        
//        for(int i=0; i<answers.length; i++) {
//            if(p1[i%5] == answers[i])
//                result1++;
//            if(p2[i%8] == answers[i])
//                result2++;
//            if(p3[i%10] == answers[i])
//                result3++;
//        }
//        
//        int max = Math.max(Math.max(result1, result2), result3);
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        
//        if(max==result1)
//            list.add(1);
//        if(max==result2)
//            list.add(2);
//        if(max==result3)
//            list.add(3);
//        
//        answer = new int[list.size()];
//        
//        for(int i=0; i<answer.length; i++){
//            answer[i] = list.get(i);
//        }
//        
//        return answer;
//    }
//}

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        int sum1=0, sum2=0, sum3=0, max=0;
        
        for(int i=0; i<answers.length; i++){
            if(person1[i%person1.length] == answers[i]) sum1++;
            if(person2[i%person2.length] == answers[i]) sum2++;
            if(person3[i%person3.length] == answers[i]) sum3++;
        }
        
        max = Math.max(sum1, Math.max(sum2, sum3));
        ArrayList<Integer> list = new ArrayList<>();
        
        if(max == sum1) list.add(1);
        if(max == sum2) list.add(2);
        if(max == sum3) list.add(3);
        
        answer = new int[list.size()];       
        
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}