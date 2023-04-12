package Programmers;

import java.util.HashSet;

public class No68644 {
    public static void main(String args[]){
       System.out.println( solution(new int[]{2,1,3,4,1}));
    }

    public static int[] solution(int[] numbers) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                hs.add(numbers[i]+numbers[j]);
            }
        }

        return hs.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
