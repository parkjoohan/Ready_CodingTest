function solution(n) {
    var answer = 0;
    let arr = String(n).split("");
    
    arr.sort((a,b) => b-a);
    answer = Number(arr.join(""));
    
    return answer;
}