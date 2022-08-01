function solution(n, lost, reserve) {
    var answer = n-lost.length;
    
    lost.sort((a,b) => b-a);
    reserve.sort((a,b) => b-a);
    
    for(let i=0; i<lost.length; i++){
        for(let j=0; j<reserve.length; j++){
            if(lost[i]===reserve[j]){
                answer++;
                lost[i]=-1;
                reserve[j]=-1;
                break;
            }
        }
    }
    
    for(let i=0; i<lost.length; i++){
        for(let j=0; j<reserve.length; j++){
            if((lost[i]-1===reserve[j]) || (lost[i]+1===reserve[j])){
                answer++;
                reserve[j]=-1;
                break;
            }
        }
    }
    
    return answer;
}