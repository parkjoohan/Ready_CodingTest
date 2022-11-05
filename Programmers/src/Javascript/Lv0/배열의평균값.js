function solution(numbers) {
    return numbers.reduce((sum, curr) => sum + curr) / numbers.length;
}