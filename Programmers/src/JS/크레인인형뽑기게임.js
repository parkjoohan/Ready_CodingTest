function solution(board, moves) {
    let answer = 0;
    let stack = [];
    
    moves.forEach((move) => {
        for(let i=0; i<board.length; i++){
            let item = board[i][move-1];

            if(item === 0)  continue;
            else if(item === stack[stack.length-1]){
                stack.pop();
                answer += 2;
            } else {
                stack.push(item);
            }

            board[i][move-1]=0;
            break;
        }
    })
    
    return answer;
}