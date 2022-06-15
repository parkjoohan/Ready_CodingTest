import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // 배열의 길이의 /2만큼의 선택이 가능함, 배열은 항상 짝수 길이
        int number = nums.length/2;
        //배열의 길이의 /2만큼의 선택이 가능함, 배열은 항상 짝수 길이
        HashSet<Integer> hs = new HashSet<>();
        
        for(int n : nums)
            hs.add(n);
        
        for(Integer integer : hs) {
            if(answer==number)
                return answer;
            answer++;
        }
        
        return answer;
    }
}