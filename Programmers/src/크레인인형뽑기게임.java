import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        for(int move : moves){
            for(int i=0; i<board.length; i++){
                if(board[i][move-1] != 0){
                    if(stack.peek() == board[i][move-1]){
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[i][move-1]);
                    }
                    
                    board[i][move-1] = 0;
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