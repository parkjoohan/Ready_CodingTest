function solution(num_list, n) {
    let result = []
    
    for(let i = 0 ; i < num_list.length; ) {
        let array = []
        
        for(let j = 0 ; j < n ; j++) {
            array.push(num_list[i])
            i++
        }
        result.push(array)
    }
    return result
}