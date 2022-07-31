function solution(s) {
    return s.split(" ")
        .map((x) => 
             x.split("").map((y, index) => 
                             ((index%2==0 ? y.toUpperCase() : y.toLowerCase()))
                            ).join(""))
        .join(" ");
}