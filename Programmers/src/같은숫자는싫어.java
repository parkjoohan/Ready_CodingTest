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
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

//public class Solution {
//    public int[] solution(int []arr) {
//        List<Integer> list = new LinkedList<>();
//
//        int last = -1;
//        for(int i=0; i<arr.length; i++){
//            if(last == arr[i])  continue;
//            last = arr[i];
//            list.add(arr[i]);
//        }
//        
//        int[] answer = new int[list.size()];
//        
//        for(int i=0; i<answer.length; i++) {
//            answer[i] = list.get(i);
//        }
//        return answer;
//    }
//}

//public class Solution {
//    public int[] solution(int []arr) {
//        List<Integer> list = new LinkedList<>();
//
//        int last = -1;
//        for(int i=0; i<arr.length; i++){
//            if(last == arr[i])  continue;
//            last = arr[i];
//            list.add(arr[i]);
//        }
//        
//        return list.stream().mapToInt(Integer::intValue).toArray();
//    }
//}