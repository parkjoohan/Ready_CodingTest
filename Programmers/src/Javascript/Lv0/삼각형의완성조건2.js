function solution(sides) {
    var answer = 0;
    
    let max = Math.max(sides[0], sides[1]);
    let min = Math.min(sides[0], sides[1]);
    
    for(let i=max-min+1; i<=max; i++)
        answer++;
    
    for(let i=max+1; i<sides[0]+sides[1]; i++)
        answer++;
    
    return answer;
}