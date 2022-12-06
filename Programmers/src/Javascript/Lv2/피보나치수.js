function solution(n) {
    var answer = 0;
    let num1 = 1, num2 = 1;
    
    if(n===1 || n===2)  return 1;
    else {
        for(let i=3; i<=n; i++) {
            answer = (num1+num2) % 1234567;
            num1 = num2;
            num2 = answer;
        }
    }
    return answer;
}