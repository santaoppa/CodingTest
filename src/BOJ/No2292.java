package BOJ;

import java.util.Scanner;
public class No2292 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 1;
        int range = 2;

        if(N == 1){
            System.out.println(count);
        }else{
            while(range <= N){
                range = range + (6*count);
                count ++;
            }
            System.out.println(count);
        }
    }
}
