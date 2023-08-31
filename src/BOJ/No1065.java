package BOJ;

import java.io.*;

public class No1065 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int cnt = 0;

        if(num < 100){
            cnt = num;
        }else{
            cnt = 99;
            for(int i=100; i<=num; i++) {
                int A = i / 100;
                int B = (i / 10) % 10;
                int C = i % 10;

                if ((A - B) == (B - C)) cnt++;
            }
        }

        System.out.println(cnt);
    }
}
