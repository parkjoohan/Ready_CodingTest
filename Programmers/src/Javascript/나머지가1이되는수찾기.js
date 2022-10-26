function solution(n) {
    var answer = 0;
    let num = 1;
    
    while(true) {
        if(n%num===1){
            answer = num;  
            break;
        }
        else
            num++;
    }
    
    return answer;
}