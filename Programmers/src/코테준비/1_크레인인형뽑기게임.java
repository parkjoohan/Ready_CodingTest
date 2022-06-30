import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        for(int move : moves){
            for(int i=0; i<board.length; i++){
                // moves에 맞는 위치의 인형
                if(board[i][move-1]!=0){
                    // 뽑은 인형과 스택 맨 위의 인형의 일치 여부 확인
                    if(stack.peek()==board[i][move-1]){
                        // 일치하면 stack 맨 위의 인형을 뽑고 answer에 +2 해준다
                        stack.pop();
                        answer+=2;
                    }
                    // 일치하지 않다면
                    else{
                        // 스택에 뽑은 인형을 넣어준다
                        stack.push(board[i][move-1]);
                    }
                    
                    // 인형 뽑은 자리에 0 넣어주기
                    board[i][move-1]=0;
                    break;
                }
            }
        }
        
        return answer;
    }
}