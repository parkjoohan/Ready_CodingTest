import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        // 단어를 저장하기 위한 ArrayList 선언
        List<String> list = new ArrayList<>();
        // 첫 단어 list에 입력
        list.add(words[0]);
        
        for(int i=1; i<words.length; i++){
            // list 중 마지막 단어
            String last = list.get(list.size()-1);
            // list에 추가할 단어
            String now = words[i];
            
            // 리스트에 추가할 단어와 같은 단어가 없고, 마지막 단어의 마지막 알파벳과 추가될 단어의 첫 알파벳이 같을 때
            if(!list.contains(now) && last.charAt(last.length()-1) == now.charAt(0))
                list.add(now);
            // 위의 조건이 아니라면
            else {
                // 몇번째 사람 (사람 번호)
                answer[0] = i%n+1;
                // 몇번째 시도일 때 (차례)
                answer[1] = i/n+1;
                break;
            }
        }

        return answer;
    }
}