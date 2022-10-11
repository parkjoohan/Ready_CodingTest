function solution(board) {
    let dx = [-1,0,1,1,1,0,-1,-1];
    let dy = [-1,-1,-1,0,1,1,1,0];
    
    for(let i=0; i<board.length; i++){
        for(let j=0; j<board.length; j++) {
            if(board[i][j]===1){
                for(let k=0; k<8; k++){
                    let nx = i + dx[k];
                    let ny = j + dy[k];
                    
                    if(0<=ny && ny<board.length && 0<=nx && nx<board.length && board[nx][ny]===0)
                        board[nx][ny]=2;
                }
            }
        }
    }
    
    return board.reduce((acc, e) => acc + e.filter(el => el === 0).length, 0);

}