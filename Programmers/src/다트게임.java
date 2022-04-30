class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int n=0, index=0, now=0;
        int[] score = new int[3];
        
        for(int i=0; i<dartResult.length(); i++){
            char c = dartResult.charAt(i);
            
            if(Character.isDigit(c)){
                n=0;
                if(c=='1' && dartResult.charAt(i+1)=='0'){
                    n=10;
                    i++;
                } else {
                    n = Character.getNumericValue(c);
                }
                now++;
            } else {
                switch(c) {
                    case 'S':
                        score[index++] = (int)Math.pow(n, 1);
                        break;
                    case 'D':
                        score[index++] = (int)Math.pow(n, 2);
                        break;
                    case 'T':
                        score[index++] = (int)Math.pow(n, 3);
                        break;
                    case '*':
                        index = index-2 < 0 ? 0 : index-2;
                        while(index < now) {
                            score[index++] *= 2;
                        }
                        n=0;
                        break;
                    case '#':
                        score[index-1] *= -1;
                        n=0;
                        break;
                }
            }
        }
        
        for(int i : score){
            answer += i;
        }
        
        return answer;
    }
}