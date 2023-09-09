package BOJ;

import java.util.Scanner;

public class No1157 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();

        int[] count = new int[26];
        int max = 0;
        char result = '?';

        for(int i=0; i<str.length(); i++){
            int index = str.charAt(i)-'A';
            count[index]++;
            if(max < count[index]){
                max = count[index];
                result = str.charAt(i);
            }else if(max == count[index]){
                result = '?';
            }
        }

        System.out.println(result);
    }
}
