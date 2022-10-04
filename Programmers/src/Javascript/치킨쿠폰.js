function solution(chicken) {    
    let answer = 0;
    
    while(true) {
        answer += (parseInt)(chicken/10);
        chicken = (chicken % 10) + (parseInt)(chicken/10);
        
        if((parseInt)(chicken/10) === 0)
            break;
    }
    
    return answer;
}