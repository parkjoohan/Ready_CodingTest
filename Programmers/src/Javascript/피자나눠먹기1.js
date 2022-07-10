function solution(n) {
    var answer = 0;
    
    answer = n/7 > (parseInt)(n/7) ? (parseInt)(n/7)+1 : (parseInt)(n/7);
    
    return answer;
}