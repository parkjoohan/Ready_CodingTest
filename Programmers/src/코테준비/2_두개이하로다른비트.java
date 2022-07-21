class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2==0)
                answer[i]=numbers[i]+1;
            else {
                String num = Long.toString(numbers[i],2);
                if(num.contains("0")){
                    for(int j=num.length()-1; j>=0; j--){
                        if(num.charAt(j)=='0'){
                            num = num.substring(0,j)+"10"+num.substring(j+2, num.length());
                            break;
                        }
                    }
                }
                else {
                    num = "10"+num.substring(1, num.length());
                }
                answer[i]=Long.parseLong(num,2);
            }
        }
        
        return answer;
    }
}