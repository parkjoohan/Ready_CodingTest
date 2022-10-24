function solution(x, n) {
    var answer = [];
    let num = x;
    
    for(let i=1; i<=n; i++){
        answer.push(num*i);
    }
    
    return answer;
}