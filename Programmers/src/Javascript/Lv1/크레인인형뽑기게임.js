function solution(board, moves) {
    let list = [];
    let result = 0;
    
    for (let i = 0; i < moves.length; i++) {
        for (let j = 0; j < board.length; j++) {
            let target = board[j][moves[i] - 1];
            
            if (target !== 0) {
                if (list[list.length - 1] === target) {
                    list.pop();
                    result += 2;
                } else {
                    list.push(target);
                }
                board[j][moves[i] - 1] = 0;
                break;
            }
            
        }
    }
    return result;
}