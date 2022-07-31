function solution(s) {
    let answer = true;
    
    if(s.length===4 || s.length===6){
        if(isNaN(s))
            return false
        else
            return true;
    } else {
        return false
    }
    
    return answer;
}