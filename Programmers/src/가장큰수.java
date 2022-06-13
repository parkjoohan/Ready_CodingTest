import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        // int -> String으로 바꿔서 저장
        ArrayList<String> list = new ArrayList<>();
        for(int num : numbers)
            list.add(String.valueOf(num));
        
        // 내림차순 정렬
        Collections.sort(list, (a, b) -> (b+a).compareTo(a+b));
        
        // 0이 앞에 나올 경우 return 0
        if(list.get(0).startsWith("0"))
            return "0";
        
        // answer에 담기
        for(String str : list)
            answer += str;
        
        return answer;
    }
}