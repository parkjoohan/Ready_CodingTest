function solution(array) {
    var answer = [];
    
    let max = 0;
    for(let i=0; i<array.length; i++){
        max = Math.max(max, array[i]);
    }
    let index = array.indexOf(max);
    
    answer.push(max);
    answer.push(index);
    
    return answer;
}