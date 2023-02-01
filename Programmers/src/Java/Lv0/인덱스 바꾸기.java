package Java.Lv0;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] answer = my_string.toCharArray();
        String result = "";
        char temp = 0;
        
        temp = answer[num1];
        answer[num1] = answer[num2];
        answer[num2] = temp;
        
        for(int i=0; i<answer.length; i++)
            result += answer[i];
        
        return result;
    }
}
