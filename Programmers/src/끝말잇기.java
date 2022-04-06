import java.util.*;

class Solution {
    public boolean solution(String[] words) {
        Set<String> set = new HashSet<>();
        boolean answer = true;
        
        set.add(words[0]);
        char last = words[0].charAt(words[0].length()-1);
        
        for(int i=1; i<words.length; i++){
            String w = words[i];
            char first = w.charAt(0);
            
            if(last != first)   return false;
            if(!set.add(words[i]))  return false;
            
            last = w.charAt(w.length() - 1);
        }
        
        return true;
    }
}