import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[numlist.length];
        
        Arrays.sort(numlist);
        
        for(int i=0; i<numlist.length; i++) {
            map.put(i, Math.abs(n - numlist[i]));
        }
        
        ArrayList<Integer> keyset = new ArrayList<>(map.keySet());
        keyset.sort((a,b) -> map.get(b).compareTo(map.get(a)));
        
        Collections.reverse(keyset);
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = numlist[keyset.get(i)];
        }
        
        return answer;
    }
}