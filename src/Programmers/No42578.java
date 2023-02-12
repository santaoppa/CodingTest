package Programmers;

import java.util.HashMap;

public class No42578 {
    public static void main(String[] args) {
        System.out.println(solution( new String[][]{{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}}));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0) + 1);
        }

        for (String key : hm.keySet())  answer *= (hm.get(key) + 1);

        return answer-1;
    }
}

/**
 * 위장
 * https://school.programmers.co.kr/learn/courses/30/lessons/42578?language=java
 */