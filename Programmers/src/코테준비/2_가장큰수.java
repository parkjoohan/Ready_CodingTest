import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        
        for(int num : numbers)
            list.add(String.valueOf(num));
        
        Collections.sort(list, (a,b)->(b+a).compareTo(a+b));
        
        if(list.get(0).startsWith("0"))
            return "0";
        
        for(String str : list)
            answer+=str;
        
        return answer;
    }
}