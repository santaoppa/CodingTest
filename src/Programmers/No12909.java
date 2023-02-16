package Programmers;

import java.util.Stack;

public class No12909 {

    public static void main(String[] args) {
        System.out.println(solution("()()"));
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
        System.out.println(solution("(()("));
    }

    public static boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    answer = false;
                    break;
                }
                stack.pop();
            }
        }

        return answer && stack.isEmpty();
    }
}

/**
 * 올바른 괄호
 * https://school.programmers.co.kr/learn/courses/30/lessons/12909
 */