class DuplicateWordsWithoutUsingMap {
    public static void main(String[] args) {
        String str = " this is is the word this is this";
        int count;
        String duplicates = "";
        String[] words = str.toLowerCase().trim().split(" ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            if (count > 1) {
                if (duplicates.isEmpty()) {
                    duplicates += " " + words[i] + " : " + count;
                } else if (!duplicates.matches("(.*) " + words[i] + " (.*)")) {
                    duplicates += " " + words[i] + " : " + count;
                } 
            }
        }
        System.out.println(duplicates);
    }
}