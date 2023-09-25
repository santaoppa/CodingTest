package BOJ;

import java.io.*;
import java.util.*;

public class No4179 {
    static int r, c;
    static int count = 0;
    static char map[][];
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };
    static Queue<int[]> jihunQ = new LinkedList<>();
    static Queue<int[]> fireQ = new LinkedList<>();
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        map = new char[r][c];

        for(int i=0; i<r; i++){
            String str = br.readLine();
            for(int j=0; j<c; j++){
                map[i][j] = str.charAt(j);
                if(map[i][j] == 'J') jihunQ.add(new int[]{i,j});
                if(map[i][j] == 'F') fireQ.add(new int[]{i,j});
            }
        }

        if(bfs()) System.out.println(count);
        else System.out.println("IMPOSSIBLE");
    }

    public static boolean bfs(){
        while(true) {
            count += 1;

            int fs = fireQ.size();
            while(fs > 0){
                fs -= 1;

                int now[] = fireQ.poll();
                for(int i=0; i<4; i++){
                    int nx = now[0] + dx[i];
                    int ny = now[1] + dy[i];

                    if(nx>=0 && nx<r && ny>=0 && ny<c){
                        if(map[nx][ny] == 'J' || map[nx][ny] == '.'){
                            fireQ.add(new int[]{nx, ny});
                            map[nx][ny] = 'F';
                        }
                    }
                }
            }

            int js = jihunQ.size();
            while(js > 0){
                js -= 1;

                int now[] = jihunQ.poll();
                for(int i=0; i<4; i++){
                    int nx = now[0] + dx[i];
                    int ny = now[1] + dy[i];

                    if( nx<0 || nx>=r || ny<0 || ny>=c) {
                        return true;
                    }
                    if(map[nx][ny] == '.') {
                        jihunQ.offer(new int[]{nx, ny});
                        map[nx][ny] = 'J';
                    }
                }
            }

            if(jihunQ.isEmpty()) break;
        }

        return false;
    }
}
