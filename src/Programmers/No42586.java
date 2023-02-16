package Programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class No42586 {

    public static void main(String[] args) {
       System.out.println(solution(new int[]{93, 30, 50}, new int[]{1,30,5}));
       System.out.println(solution(new int[]{95, 90, 99, 99, 80,99}, new int[]{1,1,1,1,1,1}));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        Queue<Integer> days = new LinkedList<Integer>();
        for(int i=0; i<progresses.length; i++){
            days.add((int)Math.ceil((100F-progresses[i])/speeds[i]));
        }

        while(!days.isEmpty()){
            int target = days.poll();
            int count = 1;

            while(!days.isEmpty() && days.peek() <=  target){
                days.poll();
                count ++ ;
            }
            answer.add(count);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}

/**
 * 기능개발
 * https://school.programmers.co.kr/learn/courses/30/lessons/42586
 */