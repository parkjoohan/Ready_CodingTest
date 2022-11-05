function solution(emergency) {
    let sorted = [...emergency].sort((a,b) => b-a);
    return emergency.map((a, _) => sorted.indexOf(a)+1);
}