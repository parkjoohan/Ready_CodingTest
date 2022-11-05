function solution(dots) {
    let arr = [];
    
    for(let i=0; i<dots.length; i++){
        for(let j=i+1; j<dots.length; j++){
            let angle = (dots[i][1]-dots[j][1]) / (dots[i][0]-dots[j][0]);
            
            if(arr.includes(angle))
                return 1;
            
            arr.push(angle);
        }
    }
    
    return 0;
}