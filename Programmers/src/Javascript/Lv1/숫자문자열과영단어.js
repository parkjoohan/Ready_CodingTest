function solution(s) {
    var answer = s;
    let word = ['zero','one','two','three','four','five','six','seven','eight','nine'];
    
    for(let i=0; i<word.length; i++){
        let arr = answer.split(word[i]);
        answer = arr.join(i);
    }
    
    return Number(answer);
}