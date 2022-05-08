import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        // map(옷의 종류, 개수) 설정
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++) {
			if(map.get(clothes[i][1]) == null) {
				map.put(clothes[i][1], 1);
			}
			else {
				map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
			}
		}
        
        for(String s : map.keySet()) {
            // 옷의 개수 + 옷 고르지 않는 경우
            answer *= (map.get(s) + 1);
        }
        answer--;
        
        return answer;
    }
}