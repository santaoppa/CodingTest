package Programmers;

import java.util.ArrayList;

public class No12906 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,3,3,0,1,1}));
        System.out.println(solution(new int[]{4,4,4,3,3}));
    }

    public static int[] solution(int[] arr) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();

        int temp = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != temp) {
                answerList.add(arr[i]);
                temp = arr[i];
            }
        }
        return answerList.stream().mapToInt(i->i).toArray();
    }
}

/**
 * 같은 숫자는 싫어
 * https://school.programmers.co.kr/learn/courses/30/lessons/12906?language=java
 */