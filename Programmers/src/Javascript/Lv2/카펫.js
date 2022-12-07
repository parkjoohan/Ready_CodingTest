function solution(brown, yellow) {
    var answer = [];
    let area = brown + yellow;
    
    for(let h=3; h<=brown; h++) {
        if(area%h===0) {
            let w = area / h;
            
            if((w-2)*(h-2) === yellow)
                return [w,h];
        }
    }
}