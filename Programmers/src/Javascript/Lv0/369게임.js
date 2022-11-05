function solution(order) {
    var answer = 0;
    let str = String(order).split("");
    
    for(let i=0; i<str.length; i++)
        if(str[i]%3==0 && str[i]!=0)
            answer++;
    
    return answer;
}