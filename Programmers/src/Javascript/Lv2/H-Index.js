function solution(citations) {
    var answer = 0;
    
    citations.sort((a,b) => a-b);
    
    for(let i=0; i<citations.length; i++) {
        let H = citations.length-i;
        
        if(citations[i] >= H) {
            answer = H;
            break;
        }
    }
    
    return answer;
}