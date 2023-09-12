package BOJ;

import java.io.*;
import java.util.*;

public class No2644 {
    static int n, m, start, end;
    static int[][] graph;
    static int[] dist;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        graph = new int[n+1][n+1];
        dist = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());

        for(int i=0; i<m; i++){
            st =  new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = 1;
        }

        System.out.println(bfs(start));
    }

    public static int bfs(int index){
        Queue<Integer> que = new LinkedList<Integer>();
        que.add(index);

        while(!que.isEmpty()){
            int temp = que.poll();

            if(temp == end) break;

            for(int i=1; i<=n; i++){
                if(graph[temp][i]==1 && dist[i]==0){
                    que.add(i);
                    dist[i] = dist[temp]+1;
                }
            }
        }

        return dist[end] == 0 ? -1 : dist[end];
    }

}
