import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        //기록을 남길 List 생성
        ArrayList<String> arr = new ArrayList();
        // Key:Id  value:닉네임 을넣고 저장
		HashMap<String, String> map = new HashMap();
        
		for (int i = 0; i < record.length; i++) {
			String[] command = record[i].split(" ");

			if (command[0].equals("Enter")) {
				arr.add(command[1] + "님이 들어왔습니다.");
				map.put(command[1], command[2]);
			} else if (command[0].equals("Change")) {
				map.put(command[1], command[2]);
			} else {
				arr.add(command[1] + "님이 나갔습니다.");
			}
		}
        
        // 아이디+문장 형식으로 저장된 List 배열을 
        // 닉네임+문장 으로 수정 
		String[] answer = new String[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
            //id만 빼오기위해, 0부터 indexOf("님")까지 substring 
			int idx = arr.get(i).indexOf("님");
			String id = arr.get(i).substring(0, idx);
			String[] temp = arr.get(i).split(" ");
			answer[i] = map.get(id) + "님이 " + temp[1];
		}
        
        return answer;
    }
}