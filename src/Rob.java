class Solution {

    public static int lengthOfLastWord(String s) {
        Integer lastWordSize = 0;
        String trimmedWord = s.trim();
        if (trimmedWord.indexOf(" ") > -1) {
            String[] tokens = trimmedWord.split(" ");
            lastWordSize = tokens[tokens.length-1].length();
        } else {
            lastWordSize = trimmedWord.length();
        }

        return lastWordSize;
    }

    public static void main(String [] args ) {

        System.out.print(lengthOfLastWord("Heelo Word"));


    }
}