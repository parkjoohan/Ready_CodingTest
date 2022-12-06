function solution(s){
    let stack = [], cnt=0;
    
    for(let i=0; i<s.length; i++) {
        if(s[i]==="(") {
            stack.push("(");
            cnt++;
        } else {
            stack.pop();
            cnt--;
        }
    }
    
    if(stack.length>0 || cnt!==0)   return false;
    return true;
}