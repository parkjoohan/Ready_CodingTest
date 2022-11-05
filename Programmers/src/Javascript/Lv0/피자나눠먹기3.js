function solution(slice, n) {
    var answer = 0;
    
    answer = n/slice > (parseInt)(n/slice) ? (parseInt)(n/slice)+1 : (parseInt)(n/slice);
    
    return answer;
}