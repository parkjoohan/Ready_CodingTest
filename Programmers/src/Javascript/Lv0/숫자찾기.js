function solution(num, k) {
    var answer = num.toString()
    if (answer.includes(k)) {
        return answer.indexOf(k) + 1;
    } else {
        return -1;
    }
}