function solution(quiz) {
    var answer = [];
    
    for(let i=0; i<quiz.length; i++){
        let arr = quiz[i].split(" ");
        
        if(arr[1] == '-') {
            if(Number(arr[0]) - Number(arr[2]) === Number(arr[4]))
                answer.push("O");
            else
                answer.push("X");
        } else {
            if(Number(arr[0]) + Number(arr[2]) === Number(arr[4]))
                answer.push("O");
            else
                answer.push("X");
        }
    }
    
    return answer;
}