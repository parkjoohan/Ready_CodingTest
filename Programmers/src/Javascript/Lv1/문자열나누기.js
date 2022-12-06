function solution(s) {
    let arr = [];
    let x=0, y=0;
    
    while(s.length>0) {
        let cnt=0;
        
        for(let i=0; i<s.length; i++) {
            s[0]===s[i] ? x+=1 : y+=1;
            
            if(x===y) {
                cnt = i+1;
                break;
            }
        }
        
        arr.push(s.slice(0,cnt));
        s = s.slice(cnt);
        if(cnt===0)
            break;
    }
    
    return arr.length;
}