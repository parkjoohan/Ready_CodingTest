function solution(d, budget) {
    var answer = 0;
    
    d.sort((a,b) => a-b);
    
    for(let i=0; i<d.length; i++){
        if(budget < d[i])
            break;
        else {
            budget-=d[i];
            answer++;
        }
    }
    
    return answer;
}