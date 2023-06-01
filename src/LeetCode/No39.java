package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class No39 {
    static List<List<Integer>> result = new ArrayList<List<Integer>>();

    public static void main(String args[]){
        System.out.println(combinationSum(new int[]{2,3,6,7}, 7));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        for (int i=0; i<candidates.length; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(candidates[i]);
            backtracking(candidates, i, 1, target - candidates[i], temp);
        }

        return result;
    }

    public static void backtracking(int[] candidates, int index, int tempSize, int target, List<Integer> temp) {
        if (target==0) {
            result.add(new ArrayList(temp));
            return;
        }

        for (int i=index; i<candidates.length; i++) {
            if (candidates[i]<=target) {
                temp.add(candidates[i]);
                backtracking(candidates, i, tempSize + 1, target - candidates[i], temp);
                temp.remove(tempSize);
            }
        }
    }
}
