function solution(k, score) {
    var array = [];
    let answer = [];
    
    for(let i=0; i<score.length; i++){
        if(i<k) 
            array.push(score[i]); 
        if(score[i] > Math.min(...array)) {
            array.pop();
            array.push(score[i]);
            array.sort((a,b) => b-a);
        }
        
        answer.push(array[array.length-1]);
    }
    
    return answer;
}