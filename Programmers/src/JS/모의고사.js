function solution(answers) {
    let answer = [];
    let person1 = [1,2,3,4,5];
    let person2 = [2,1,2,3,2,4,2,5];
    let person3 = [3,3,1,1,2,2,4,4,5,5];
    let score = [0,0,0];
    
    for(let i=0; i<answers.length; i++){
        if(answers[i] === person1[i%person1.length]) score[0]++;
        if(answers[i] === person2[i%person2.length]) score[1]++;
        if(answers[i] === person3[i%person3.length]) score[2]++;
    }
    
    const max = Math.max(...score);
    
    for(let i=0; i<score.length; i++){
        if(max === score[i])
            answer.push(i+1);
    }
    
    return answer;
}