class Main {
    public int solution(String str) {
        String[] numTowords = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0;  i<numTowords.length; i++){
            str = str.replaceAll(numTowords[i], String.valueOf(i));
        }
        return Integer.parseInt(str);
    }   
}      