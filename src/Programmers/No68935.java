package Programmers;

public class No68935 {
    public static void main(String[] args){
        System.out.println(solution(45));
    }

    public static int solution(int n) {
        int answer = 0;

        String result = "";
        while(n != 0) {
            result += n%3;
            n /= 3;
        }
        return Integer.parseInt(result, 3);
    }
}