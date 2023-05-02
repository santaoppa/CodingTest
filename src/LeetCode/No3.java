package LeetCode;

import java.util.HashMap;

public class No3 {
    public static void main(String args[]){
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int max = 0;
        int start = 0;

        for(int i=0; i<s.length(); i++){
            if(hm.get(s.charAt(i)) != null && hm.get(s.charAt(i)) >= start){
                start = hm.get(s.charAt(i))+1;
            }
            hm.put(s.charAt(i), i);
            max = Math.max(max, i-start+1);
        }
        return max;
    }
}
