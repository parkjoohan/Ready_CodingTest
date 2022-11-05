function solution(numbers) {
    var answer = 0;
    let max = numbers[0] * numbers[1];
    
    for(let i=0; i<numbers.length-1; i++)
        for(let j=i+1; j<numbers.length; j++)
            if(max < numbers[i]*numbers[j])
                max = numbers[i]*numbers[j];
    
    return max;
}