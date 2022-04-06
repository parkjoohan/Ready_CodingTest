import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        List<String> list = new LinkedList<>();
        
        for(String p : participant) list.add(p);
        for(String c : completion)  list.remove(c);
        
        return list.get(0);
    }
}