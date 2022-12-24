function solution(arr1, arr2) {
    let answer = [];
    arr1.forEach(row => answer.push(Array(arr2[0].length).fill(0)));

    for (let i = 0; i < arr1.length; i++)
        for (let j = 0; j < arr2[0].length; j++)
            for (let n = 0; n < arr1[0].length; n++)
                answer[i][j] += (arr1[i][n] * arr2[n][j]);

    return answer;
}