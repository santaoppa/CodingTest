package LeetCode;

public class No11 {
    public static void main(String agrs[]){
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    public static int maxArea(int[] height) {
        int max = 0, left = 0, right = height.length-1;

        while(left < right){
            int w = right-left;
            int h = Math.min(height[left], height[right]);

            if(height[left]<height[right]) left++;
            else right--;

            max = Math.max(max, w*h);
        }
        return max;
    }
}
