function solution(s) {
    var answer = [];
    
    let array = s.split(" ");
    
    for(let i=0; i<array.length; i++) {
        answer.push(array[i].substr(0,1).toUpperCase() + array[i].substr(1,array[i].length).toLowerCase());
    }
    
    return answer.join(" ");
}