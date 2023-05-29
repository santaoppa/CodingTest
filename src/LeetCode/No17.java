package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No17 {
    static Map<String, String> map = new HashMap<>();
    static List<String> result = new ArrayList<>();
    static int size = 0;

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");

        size = digits.length();

        if (size == 0)  return new ArrayList<>();
        dfs(digits, "");

        return result;
    }

    public static void dfs(String digits, String words) {
        if (size == words.length()) {
            result.add(words);
            return;
        }

        String target = map.get(String.valueOf(digits.charAt(0)));

        for (int i = 0; i < target.length(); i++) {
            dfs(digits.substring(1), words + target.charAt(i));
        }
    }
}
