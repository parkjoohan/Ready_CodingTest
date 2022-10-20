function solution(n) {
    var answer = 0;
    let num = Math.sqrt(n);
    
    if(n%num === 0)
        return (num+1)*(num+1);
    else
        return -1;
}