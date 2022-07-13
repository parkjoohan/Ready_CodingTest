function solution(n) {
    let number = [];
    let idx = 2;
    
    while(n !== 1) {
        if(n%idx === 0) {
            number.push(idx);
            n/=idx;
            idx = 2;
        } else {
            idx += 1;
        }
    }

    return Array.from(new Set(number));
}