function solution(number, limit, power) {
    var answer = 0;
    
    for(let i=1; i<=number; i++) {
        let cnt=1;
        
        for(let j=1; j<=i/2; j++){
            if(i%j===0)
                cnt++;
        }
        
        answer += (limit >= cnt ? cnt : power);
    }
    
    return answer;
}