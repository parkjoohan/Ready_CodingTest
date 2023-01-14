function solution(n) {
    let num = 1;
    
    while(true) {
        if((num*6)%n==0){
            return num;
            break;
        } else 
            num++;
    }
    
    return num;
}