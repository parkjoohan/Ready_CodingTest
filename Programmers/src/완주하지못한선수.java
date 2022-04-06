import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i=0; i<completion.length; i++) {
        	if(!participant[i].equals(completion[i]))
        		return participant[i];
        }
        
        return participant[participant.length - 1];
    }
}

//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        List<String> list = new LinkedList<>();
//        
//        for(String p : participant) list.add(p);
//        for(String c : completion)  list.remove(c);
//        
//        return list.get(0);
//    }
//}

//import java.util.*;
//
//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        Map<String, Integer> list = new HashMap<>();
//        
//        for(String p : participant){
//            list.put(p, list.getOrDefault(p, 0) + 1);
//        }
//        
//        for(String c : completion){
//            int n = list.get(c) - 1;
//            if(n==0)    list.remove(c);
//            else    list.put(c, n);
//        }
//        
//        return list.keySet().iterator().next();
//    }
//}