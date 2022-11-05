function solution(numbers) {
    var answer = "";
    let num_list = ["zero","one","two","three","four","five","six","seven","eight","nine"];
    let num = [0,1,2,3,4,5,6,7,8,9];
    
    for(let i=0; i<num_list.length; i++){
        numbers = numbers.replaceAll(num_list[i], num[i]);
    }
    
    answer = Number(numbers);
    return answer;
}