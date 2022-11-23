function solution(n, arr1, arr2) {
    var answer = [];
    
    for(let i=0; i<n; i++){
        let num = (arr1[i] | arr2[i]).toString(2);
        num = num.replace(/1/g, "#").replace(/0/g, " ");
        answer.push(num.padStart(n, " "));
    }
    
    return answer;
}