package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class No136 {
    public static void main(String args[]){
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
    public static int singleNumber(int[] nums) {
        int len = nums.length;
        Map<Integer,Integer> hm = new HashMap<>();
        for (int i=0; i<len ; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        for(Integer key : hm.keySet()){
            if(hm.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}
