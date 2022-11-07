function solution(arr) {
    
    let num = 0;
    for(let i=0; i<arr.length; i++){
        if(arr[num] > arr[i])
            num = i;
    }
    
    arr.splice(num, 1);
    if(arr.length===0)
        return [-1];
    
    return arr;
}