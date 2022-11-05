function solution(keyinput, board) {  
    let answer = [0,0];
    let width = Math.abs(Math.floor(board[0] / 2));
    let height = Math.abs(Math.floor(board[1] / 2));
    
    for(let i=0; i<keyinput.length; i++){
        if(keyinput[i] === 'up')
            answer[1]++;
        else if(keyinput[i] === 'down')
            answer[1]--;
        else if(keyinput[i] === 'left')
            answer[0]--;
        else
            answer[0]++; 
        
        if(Math.abs(answer[0]) > width)
            answer[0] = answer[0] > 0 ? width : width * -1;
        else if(Math.abs(answer[1]) > height)
            answer[1] = answer[1] > 0 ? height : height * -1;
    }
    

    
    return answer;
}