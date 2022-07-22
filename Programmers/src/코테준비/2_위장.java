import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();        
        int answer = 1;
        
        for(int i=0; i<clothes.length; i++){
            if(map.get(clothes[i][1])==null) 
                map.put(clothes[i][1], 1);
            else
                map.put(clothes[i][1], map.get(clothes[i][1])+1);
        }
        
        for(String str : map.keySet()){
            answer *= (map.get(str)+1);
        }
        
        answer--;
        
        return answer;
    }
}