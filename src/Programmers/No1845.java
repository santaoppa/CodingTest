package Programmers;

import java.util.HashSet;

public class No1845 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1, 2, 3}));
        System.out.println(solution(new int[]{3, 3, 3, 2, 2, 4}));
        System.out.println(solution(new int[]{3, 3, 3, 2, 2, 2}));
    }

    public static int solution(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int num : nums)  hs.add(num);
        return Math.min(hs.size(), nums.length/2);
    }
}

/**
 * 폰켓몬
 * https://school.programmers.co.kr/learn/courses/30/lessons/1845
 */