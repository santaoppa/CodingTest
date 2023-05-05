package LeetCode;

public class No7 {
    public static void main(String args[]){
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        long answer = 0;

        while (x != 0) {
            answer = answer * 10 + x % 10;
            if(answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) return 0;
            x /= 10;
        }
        return (int)answer;
    }
}
