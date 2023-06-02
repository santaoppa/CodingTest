package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class No46 {
    public static void main(String args[]){
        System.out.println(permute(new int[]{1,2,3}));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        backTracking(answer, new ArrayList<>(), nums);
        return answer;
    }

    public static void backTracking(List<List<Integer>> result, List<Integer> comb, int[] nums) {
        if (comb.size() == nums.length) {
            result.add(new ArrayList<>(comb));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (comb.contains(nums[i])) continue;
            comb.add(nums[i]);
            backTracking(result, comb, nums);
            comb.remove((Integer) nums[i]);
        }
    }
}
