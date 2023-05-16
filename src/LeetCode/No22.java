package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class No22 {
    public static void main(String args[]){
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        dfs(n, 0, 0, "", result);
        return result;
    }

    public static void dfs(int n, int open, int close, String str, List<String> result){
        if(open == n && close == n){
            result.add(str);
            return;
        }

        if(open < n){
            dfs(n, open+1, close, str+"(", result);
        }
        if(open > close){
            dfs(n, open, close+1, str+")", result);
        }
    }
}
