public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello hi";
        System.out.println(lengthOfLastWord(s));
    }
    static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        String lastWord = words[words.length-1];
        int count = 0;
        while (count<lastWord.length()){
            count++;
        }
        return count;
    }
}
