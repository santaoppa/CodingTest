package LeetCode;

public class No28 {
    public static void main(String args[]){
        System.out.println(strStr("leetcode","leeto"));
    }
    public static int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        int index = -1;
        for(int i=0; i<haystack.length(); i++){
            if(i+needle.length() > haystack.length())  break;

            if(haystack.substring(i, i+needle.length()).equals(needle)){
                index = i;
                break;
            }
        }
        return index;
    }
}
