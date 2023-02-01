package Java.Lv0;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] array = my_string.toCharArray();
        
        for(int i=0; i<array.length; i++)
            for(int j=0; j<n; j++)
                answer+=array[i];
        
        return answer;
    }
}