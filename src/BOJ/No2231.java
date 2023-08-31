package BOJ;

import java.io.*;

public class No2231 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i=1; i<=num; i++){
            int sum = i;
            int n = i;
            while(n!=0){
                sum += n%10;
                n/=10;
            }
            if(sum == num){
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
