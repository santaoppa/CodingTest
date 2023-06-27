package LeetCode;

public class No69 {
    public static void main(String args[]){
        System.out.println(mySqrt(8));
    }
    public static int mySqrt(int x) {
        if (x <= 1) return x;

        int left = 1, right = x/2;

        while (left < right) {
            int mid = (left+(right-left)/2)+1;
            if (mid == x/mid)  return mid;
            else if (mid > x/mid) right = mid - 1;
            else  left = mid;
        }
        return left;
    }
}
