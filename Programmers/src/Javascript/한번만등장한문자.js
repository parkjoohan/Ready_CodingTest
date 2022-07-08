function solution(s) {
    let answer = [];
    
    let str = s.split("");
    
    str.forEach((item) => {
        if(s.indexOf(item) === s.lastIndexOf(item)){
            answer.push(item);
        }
    })
    
    return answer.sort().join("");
}