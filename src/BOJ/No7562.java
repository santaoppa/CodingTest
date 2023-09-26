package BOJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No7562 {
    static int col, goalX, goalY;
    static int map[][];
    static boolean visited[][];
    static int[] dx = {-2, -1, 1, 2, 2, 1 ,-1, -2};
    static int[] dy = {-1, -2, -2, -1, 1 ,2 ,2, 1};

    public static void bfs(int x, int y){
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{x,y});
        visited[x][y] = true;

        while(!que.isEmpty()){
            int[] now = que.poll();

            if(now[0] == goalX && now[1] == goalY) break;

            for(int i=0; i<8; i++){
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if(0<=nx && nx<col && 0<=ny && ny<col && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    map[nx][ny] = map[now[0]][now[1]] + 1;
                    que.add(new int[]{nx,ny});
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=0; t<T; t++) {
            col = sc.nextInt();
            map = new int[col][col];
            visited = new boolean[col][col];

            int x = sc.nextInt();
            int y = sc.nextInt();

            goalX = sc.nextInt();
            goalY = sc.nextInt();

            bfs(x, y);
            System.out.println(map[goalX][goalY]);
        }
    }
}
