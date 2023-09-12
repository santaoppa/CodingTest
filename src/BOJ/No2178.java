package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No2178 {
    static int[][] map;
    static int n, m;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<m; j++){
                map[i][j] = str.charAt(j) - '0';
            }
        }

        System.out.println(bfs(0,0));
    }

    public static int bfs(int x, int y){
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{x,y});

        while(!que.isEmpty()){
            int now[] = que.poll();
            x = now[0];
            y = now[1];

            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx>=0 && nx<n && ny>=0 && ny<m && map[nx][ny]==1){
                    map[nx][ny] = map[x][y]+1;
                    que.offer(new int[]{nx,ny});
                }
            }
        }

        return map[n-1][m-1];
    }

}
