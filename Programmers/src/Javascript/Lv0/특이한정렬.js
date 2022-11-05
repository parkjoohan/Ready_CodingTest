function solution(numlist, n) {
    return numlist.sort((a,b) => {
        let [gap1, gap2] = [Math.abs(a-n), Math.abs(b-n)];
        
        if(gap1===gap2)
            return b-a;
        else
            return gap1-gap2;
    })
}