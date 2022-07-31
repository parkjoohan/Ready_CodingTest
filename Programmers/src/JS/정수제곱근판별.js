function solution(n) {
    let answer = 0;
    let num = Math.sqrt(n);
    
    if(n%num===0){
        num++;
        answer=num*num;
    } else 
        answer = -1;
    
    return answer;
}