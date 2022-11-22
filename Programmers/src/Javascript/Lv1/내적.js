function solution(a, b) {
    return a.reduce((answer, _, i) => answer += a[i]*b[i], 0);
}