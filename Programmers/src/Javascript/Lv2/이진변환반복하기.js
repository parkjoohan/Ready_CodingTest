function solution(s) {
    var answer = [0,0];
    
    while(s!=="1") {
        s=s.split("");
        let numCntOne = s.filter(v => v==="1").length;
        answer[0]++;
        answer[1] += s.length - numCntOne;
        s = numCntOne.toString(2);
    }
    
    return answer;
}