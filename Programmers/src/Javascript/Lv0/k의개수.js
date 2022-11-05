function solution(i, j, k) {
    var answer = 0;
    let arr = [];
    let str = "";
    
    for(let z=i; z<=j; z++)
        arr.push(z);
    
    str = arr.join('');
        
    for(let n=0; n<str.length; n++) {
        if((str.charAt(n) - '0') == k)
            answer++;
    }
    
    
    return answer;
}