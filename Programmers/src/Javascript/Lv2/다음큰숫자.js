function solution(n) {
    let nowNum = n.toString(2).split("1").length;
    
    while(true) {
        n++;
        if(n.toString(2).split("1").length === nowNum)
            return n;
    }
}