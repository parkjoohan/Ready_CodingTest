//import java.util.*;
//
//class Solution {
//    public int[] solution(String[] id_list, String[] report, int k) {
//        int[] answer = new int[id_list.length];
//        Map<String, HashSet<String>> map = new HashMap<>();
//        Map<String, Integer> index = new HashMap<>();
//        
//        for(int i=0; i<id_list.length; i++){
//            String name = id_list[i];
//            map.put(name, new HashSet<>());
//            index.put(name, i);
//        }
//        
//        for(String s : report){
//            String[] str = s.split(" ");
//            String from = str[0];
//            String to = str[1];
//            map.get(to).add(from);
//        }
//        
//        for(int i=0; i<id_list.length; i++){
//            HashSet<String> send = map.get(id_list[i]);
//            if(send.size() >= k){
//                for(String name : send){
//                    answer[index.get(name)]++;
//                }
//            }
//        }
//        
//        return answer;
//    }
//}

import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        int[] answer = new int[id_list.length];
        
        // 1. 중복 제거
        HashSet<String> reportSet = new HashSet<String>();
        for (String rep : report)
            reportSet.add(rep);

        // 2. report에서 각 사람이 신고당한 횟수를 countHash으로 정의하기
        HashMap<String, ArrayList<String>> notifyListHash = new HashMap<>();
        for (String rep : reportSet){
            int blankIdx = rep.indexOf(" ");
            String reporter = rep.substring(0, blankIdx);
            String reportee = rep.substring(blankIdx + 1);
            
            ArrayList<String> reporterList = notifyListHash.getOrDefault(reportee, null);
            if(reporterList == null) reporterList = new ArrayList<>();

            reporterList.add(reporter);
            notifyListHash.put(reportee, reporterList);
        }

        // 3. notifyListHash를 기반으로 reportHash만들기
        HashMap<String, Integer> reporterHash = new HashMap<>();
        for (ArrayList<String> notifyList : notifyListHash.values())
            if (notifyList.size() >= k)
                for(String reporter : notifyList)
                    reporterHash.put(reporter, reporterHash.getOrDefault(reporter, 0) + 1);

        // 4. reporterHash 정보를 answer에 옮겨담기
        for (int i = 0; i < id_list.length; i++)
            answer[i] = reporterHash.getOrDefault(id_list[i], 0);

        return answer;
    }
}