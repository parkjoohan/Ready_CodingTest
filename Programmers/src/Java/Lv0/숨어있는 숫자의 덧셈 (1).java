package Java.Lv0;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] list = my_string.replaceAll("[a-zA-Z]", "").split("");
        
        for(int i=0; i<list.length; i++)
            answer += Integer.parseInt(list[i]);
        
        return answer;
    }
}