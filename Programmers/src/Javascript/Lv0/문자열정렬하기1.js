function solution(my_string) {
    var answer = [];
    let str = my_string.split("");
    
    for(let i=0; i<str.length; i++) {
        if(Number(str[i]))
            answer.push(Number(str[i]));
        else if(str[i]=="0")
            answer.push(0);
    }
    
    answer.sort(function(a,b) {
        return a-b;
    });
    
    return answer;
}