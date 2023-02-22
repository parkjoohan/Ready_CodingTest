class Solution {
    boolean solution(String s) {
        s = s.toLowerCase(); // 대문자와 소문자 구분하지 않기 위해 모두 소문자로 변경
        int pCount = 0, yCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'p') {
                pCount++;
            } else if (c == 'y') {
                yCount++;
            }
        }

        return pCount == yCount;
    }
}