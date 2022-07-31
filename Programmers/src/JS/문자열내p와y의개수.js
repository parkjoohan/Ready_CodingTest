function solution(s){
    let answer = true;
    let ch = '';
    let cnt1=0, cnt2=0;
    
    for(let i=0; i<s.length; i++){
        ch = s.charAt(i);
        
        if(ch==='p' || ch==='P')  cnt1++;
        else if(ch==='y' || ch==='Y') cnt2++;
    }
    
    if(cnt1!==cnt2) answer=false;

    return answer;
}