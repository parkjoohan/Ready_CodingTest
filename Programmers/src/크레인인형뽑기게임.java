import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        for(int move : moves){
            for(int i=0; i<board.length; i++){
                // moves의 맞는 board의 위치에 인형이 있는 경우
                if(board[i][move-1]!=0){
                    // 인형을 넣는 스택의 맨 위의 인형과 board에서 뽑는 인형이 같으면
                    if(stack.peek()==board[i][move-1]){
                        // stack 맨위의 인형을 뽑아내고, 인형 2개가 없어지므로 answer에 +2한다
                        stack.pop();
                        answer += 2;
                    } 
                    // 인형을 넣는 스택의 맨 위의 인형과 board에서 뽑는 인형이 같지 않다면
                    else {
                        // stack에 뽑은 인형을 넣는다.
                        stack.push(board[i][move-1]);
                    }
                    
                    // 인형을 뽑은 자리에 0을 넣고 break;
                    board[i][move-1]=0;
                    break;
                }
            }
        }
        
        return answer;
    }
}

//// javascript
//function solution(board, moves) {
//    var answer = 0;
//    const stack = [];
//    
//    moves.forEach((move) => {
//        for(let i=0; i<board.length; i++){
//            const item = board[i][move-1];
//            if(item === 0)  continue;
//            
//            if(item === stack[stack.length - 1]){
//                stack.pop();
//                answer += 2;
//            } else {
//                stack.push(item);
//            }
//            
//            board[i][move-1]=0;
//            break;
//        }
//    })
//    
//    return answer;
//}