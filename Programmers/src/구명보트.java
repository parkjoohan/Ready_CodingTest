//import java.util.*;
//
//class Solution {
//    public int solution(int[] people, int limit) {
//        int answer = 0;
//        int min = 0;
//        Arrays.sort(people);
//        
//        for(int max=people.length - 1; min <= max; max--){
//            if(people[min] + people[max] <= limit){
//                min++;
//            }
//            answer++;
//        }
//        return answer;
//    }
//}

import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer=0;
        int first=0, last=people.length-1;
        Arrays.sort(people);
        
        while(first<=last){
            answer++;
            if(people[first]+people[last]<=limit)
                first++;
            last--;
        }
        return answer;
    }
}