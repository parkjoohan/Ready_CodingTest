function solution(priorities, location) {
    var answer = 0;
    let cnt = 0;
    let curDoc = location;
    
    while(priorities.length > 0) {
        let current = priorities.shift();
        
        if(priorities.filter((e) => e>current).length > 0) {
            priorities.push(current);
        } else {
            cnt++;
            
            if(curDoc == 0)
                return answer =cnt;
        }
        
        curDoc--;
        
        if(curDoc === -1) 
            curDoc = priorities.length-1;
    }
    
    return answer;
}

