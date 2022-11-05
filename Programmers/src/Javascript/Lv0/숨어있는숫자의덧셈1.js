function solution(my_string) {
    var answer = 0;
    let str = my_string.split("");
    
    for(let i=0; i<str.length; i++)
        if(Number(str[i]))
            answer += Number(str[i]);
    
    return answer;
}