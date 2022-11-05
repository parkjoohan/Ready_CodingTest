function solution(lines) {
    let arr = new Array(201).fill(0);
    
    lines.forEach((line) => {
        for(let i=line[0]+101; i<=line[1]+100; i++)
            arr[i]++;
    });
    
    return arr.filter((line) => line > 1).length;
}