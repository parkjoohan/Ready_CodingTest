function solution(rsp) {
    var answer = '';
    let str = rsp.split("");
    
    for(let i=0; i<str.length; i++){
        if(str[i]==0)
            answer+=5;
        else if(str[i]==2)
            answer+=0;
        else
            answer+=2;
    }
    
    return answer;
}