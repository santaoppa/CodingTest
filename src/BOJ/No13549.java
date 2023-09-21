package BOJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No13549 {
    static int n,k;
    static boolean[] visited = new boolean[100001];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        System.out.println(bfs());
    }

    public static int bfs(){
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{n,0});

        int result = Integer.MAX_VALUE;

        while(!que.isEmpty()){
            int[] now = que.poll();
            int index = now[0];
            int time = now[1];

            visited[index] = true;

            if(index == k) result = Math.min(result, time);
            if(index*2 <= 100000 && !visited[index*2]) que.offer(new int[]{index*2, time});
            if(index+1 <= 100000 && !visited[index+1]) que.offer(new int[]{index+1, time+1});
            if(index-1 >= 0 && !visited[index-1]) que.offer(new int[]{index-1, time+1});
        }

        return result;
    }
}
