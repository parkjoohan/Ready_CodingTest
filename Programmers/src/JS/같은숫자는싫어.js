function solution(arr)
{
    var answer = [];
    let num = 10;

    for(let i=0; i<arr.length; i++){
        if(arr[i] !== num)
            answer.push(arr[i]);
        num = arr[i];
    }
    
    return answer;
}