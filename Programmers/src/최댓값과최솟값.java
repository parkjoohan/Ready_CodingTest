import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<>();
        String[] arr = s.split(" ");
        
        for(int i=0; i<arr.length; i++){
            list.add(Integer.parseInt(arr[i]));
        }
        
        answer = Collections.min(list) + " " + Collections.max(list);
        
        return answer;
    }
}