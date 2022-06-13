// 1. 23563850135에서 4자리 -> 맨 뒤 1, 3, 5를 제외한 가장 큰 수를 찾는다.
// 2. 23563850 -> 8이다 -> 8 오른쪽부터 다시 검색
// 3. 50135 중 맨 뒤 2개 제외하고 가장 큰 값 찾는다 -> 5이다
// 4. 0135 중 맨 뒤 1개 제외하고 가장 큰 값 찾는다 -> 3이다
// 5. 마지막 5를 붙인다. 최종 answer = "8535"

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int index = 0;
        int max = 0;
        
        for(int i=0; i<number.length()-k; i++){
            max = 0;
            for(int j=index; j<=i+k; j++){
                if(max<number.charAt(j)-'0'){
                    max = number.charAt(j)-'0';
                    index = j+1;
                }
            }
            answer.append(max);
        }
        return answer.toString();
    }
}