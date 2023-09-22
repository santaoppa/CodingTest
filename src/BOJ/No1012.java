package BOJ;

import java.io.*;
import java.util.*;

public class No1012{
    static int M, N, K;
    static int map[][] = new int[50][50];

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int tc=0; tc<T; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            for(int k=0; k<K; k++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }

            int cnt = 0;
            for(int i=0; i<M; i++){
                for(int j=0; j<N; j++){
                    if(dfs(i,j)) cnt += 1;
                }
            }

            System.out.println(cnt);

        }
    }

    public static boolean dfs(int x, int y){
        if(x<0 || x>=M || y<0 || y>=N) return false;
        if(map[x][y]==1){
            map[x][y]=0;
            dfs(x-1,y);	//상
            dfs(x+1,y);	//하
            dfs(x,y-1);	//좌
            dfs(x,y+1);	//우
            return true;
        }

        return false;
    }
}