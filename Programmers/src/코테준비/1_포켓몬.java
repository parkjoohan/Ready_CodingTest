import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int number = nums.length/2;
        HashSet<Integer> hs = new HashSet<>();
        
        for(int n : nums)
            hs.add(n);
        
        for(Integer integer : hs){
            if(answer==number)
                return answer;
            answer++;
        }
        
        return answer;
    }
}