function solution(num, total) {
    let min = Math.ceil(total/num - Math.floor(num/2));
    let max = Math.floor(total/num + Math.floor(num/2));
    
    return new Array(num).fill(0).map((a,b) => {
        return b + min;
    });
}