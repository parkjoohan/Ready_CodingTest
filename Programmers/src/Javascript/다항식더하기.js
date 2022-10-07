function solution(polynomial) {
    let arr = polynomial.split(" + ");
    let numx = 0, num = 0;
    
    for(let i=0; i<arr.length; i++){
        if(arr[i].includes('x')){
            let tmp = arr[i].split("x");
            
            if(tmp[0]==="")
                numx+=1;
            else
                numx+=Number(tmp[0]);
        } else {
            num += Number(arr[i]);
        }
    }
    
    if(numx !== 0 && num !== 0)
        return numx === 1 ? `x + ${num}` : `${numx}x + ${num}`;
    else if(numx !== 0 && num === 0)
        return numx === 1 ? 'x' : `${numx}x`;
    else if(numx === 0 && num !==0)
        return `${num}`;
    else
        return "0";
}