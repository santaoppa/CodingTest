package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class No1926 {
    static int n, m, count;
    static int[][] map;

    public static boolean dfs(int x, int y){
        if(x<0 || x>=n || y<0 || y>=m) return false;
        if(map[x][y] == 1){
            map[x][y] = 0;
            count += 1;

            dfs(x-1, y);
            dfs(x+1, y);
            dfs(x, y-1);
            dfs(x, y+1);
            return true;
        }
        return false;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                count = 0;
                if(dfs(i,j)){
                    arr.add(count);
                }
            }
        }

        Collections.sort(arr);
        System.out.println(arr.size());
        System.out.println(arr.size() == 0 ? 0 : arr.get(arr.size() - 1));
    }
}
