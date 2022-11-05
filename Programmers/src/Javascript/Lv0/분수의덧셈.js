function solution(denum1, num1, denum2, num2) {
    let upper = num1*denum2 + num2*denum1;
    let under = num1*num2;
    let LCM = 1;
    
    for(let i=1; i<=upper; i++){
        if(upper%i===0 && under%i===0)
            LCM = i;
    }
    
    return [upper/LCM, under/LCM];
}