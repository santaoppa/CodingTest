package LeetCode;

public class No58 {
    public static void main(String args[]){
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        String str = s.trim();
        String result[] = str.split(" ");
        return result[result.length-1].length();
    }
}
