import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        
        List<Integer> list = new LinkedList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == max)
                list.add(i);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}