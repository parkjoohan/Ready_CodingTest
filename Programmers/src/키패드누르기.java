class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        // 좌표 구하기 위해 *은 10, #은 12로 생각
        int left = 10;
        int right = 12;
    
        // 누르는 횟수만큼 반복
        for(int i=0; i<numbers.length; i++){
            // 1, 4, 7은 왼손으로 누르고, 왼손 위치를 갱신한다.
            if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7){
                answer+="L";
                left=numbers[i];
                continue;
            }
            // 3, 6, 9은 오른손으로 누르고, 오른손 위치를 갱신한다.
            else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9){
                answer+="R";
                right=numbers[i];
                continue;
            }
            // 중앙 숫자들은 거리에 따라 누른다
            else {
                // 중앙이 0이면 11을 입력하고 아니면 해당 번호를 입력한다
                int x = (numbers[i]==0 ? 11 : numbers[i]);
                
                // 왼손, 오른손으로부터 중앙의 번호와의 거리를 맨해튼 거리 측정법으로 구한다.
                int l_length = Math.abs((x-1)/3 - (left-1)/3) + Math.abs((x-1)%3 - (left-1)%3);
                int r_length = Math.abs((x-1)/3 - (right-1)/3) + Math.abs((x-1)%3 - (right-1)%3);
                
                // 구한 거리가 같은 경우 손에 따라 갱신해준다.
                if(l_length==r_length){
                    if(hand.equals("right")){
                        answer+="R";
                        right=x;
                    } else {
                        answer+="L";
                        left=x;
                    }
                }
                
                // 왼손으로부터 거리가 짧은 경우는 왼손, 오른손으로부터 거리가 짧은 경우 오른손으로 갱신
                else {
                    if(l_length<r_length){
                        answer+="L";
                        left=x;
                    } else {
                        answer+="R";
                        right=x;
                    }
                }
            }
        }
        
        return answer;
    }
}