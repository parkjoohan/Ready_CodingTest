class Solution {
    public int solution(String word) {
        int answer = word.length();
        
        String str = "AEIOU";
        int[] num = {781, 156, 31, 6, 1};
        
        for(int i=0; i<word.length(); i++){
            int index = str.indexOf(word.charAt(i));
            answer += num[i] * index;
        }
        
        return answer;
    }
}