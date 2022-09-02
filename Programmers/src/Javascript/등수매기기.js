function solution(score) {
    let avg = score.map(n => (n[0]+n[1])/2);
    let sort = avg.slice().sort((a,b) => b-a);
    return avg.map(n => sort.indexOf(n)+1);
}