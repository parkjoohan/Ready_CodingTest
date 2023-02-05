package Java.Lv0;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] array = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        
        for(int i=0; i<array.length; i++) {
            if(!array[i].equals(""))
                answer += Integer.valueOf(array[i]);
        }
        
        return answer;
    }
}