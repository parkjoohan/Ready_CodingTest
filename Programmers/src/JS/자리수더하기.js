function solution(n)
{
    var answer = 0;

    do {
        answer += (n%10);
        n = Math.floor(n/10);
    } while(n>0);

    return answer;
}