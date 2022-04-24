class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            // 0으로 끝난 경우 마지막 수만 1로 바뀌면 됨. 따라서 +1
            if(numbers[i] % 2 == 0)
                answer[i] = numbers[i] + 1;
            
            // 1로 끝나는 경우
            else {
                // 2진수 변환
                String num = Long.toString(numbers[i], 2);
                
                // 중간에 0이 있는 경우
                if(num.contains("0")){
                    for(int j=num.length()-1; j>=0; j--){
                        // 가장 뒤에 있는 0을 1로, 그 바로 뒤를 0으로 변경
                        num = num.substring(0, j) + "10" + num.substring(j+2, num.length());
                        break;
                    }
                }
                
                // 1로만 구성된 경우
                else {
                    // 맨앞을 "10"로 변경
                    num = "10" + num.substring(1, num.length());
                }
                answer[i] = Long.parseLong(num, 2);
            }
        }
        return answer;
    }
}