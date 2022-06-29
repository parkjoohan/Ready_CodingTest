import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        // 유저별 순서저장
        Map<String, Integer> index = new HashMap<>();
        // 유저별 자신을 신고한 유자
        Map<String, HashSet<String>> map = new HashMap<>();
        
        // 초기화
        for(int i=0; i<id_list.length; i++){
            index.put(id_list[i], i);
            map.put(id_list[i], new HashSet<>());
        }
        
        // report 공백 기준으로 잘라서 1이 username key와 같으면 0을 value에 추가
        for(String s : report){
            String[] str = s.split(" ");
            map.get(str[1]).add(str[0]);
        }
        
        // 유저별 자신을 신고한 유저가 k명 이상이면 그 신고한 유저에게 메일 보냄
        for(int i=0; i<id_list.length; i++){
            HashSet<String> send = map.get(id_list[i]);
            if(send.size()>=k){
                for(String name : send)
                    answer[index.get(name)]++;
            }
        }
        
        return answer;
    }
}