function solution(a, b) {
    let under = b / getGCD(a,b);
    
    while(under != 1) {
        if(under%2 === 0)
            under /= 2;
        else if(under%5 === 0)
            under /= 5;
        else
            return 2;
    }
    
    return 1;
}

let getGCD = (num1, num2) => {
    if(num2 === 0)
        return num1;
    else
        return getGCD(num2, num1%num2);
}