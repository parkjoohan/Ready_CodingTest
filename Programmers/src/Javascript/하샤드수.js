function solution(x) {
    var answer = true;
    let array = String(x).split("");
    let num = 0;
    
    for(let i=0; i<array.length; i++)
        num += Number(array[i]);
    
    if(x%num!==0)
        answer = false;
    
    return answer;
}