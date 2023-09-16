package BOJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No1697 {
    static int n, k;
    static int[] count = new int[100001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        if (n == k) {   // 수빈과 동생이 있는 위치가 같을 때
            System.out.println(0);
        } else {
            bfs();
        }
    }

    public static void bfs() {
        Queue<Integer> que = new LinkedList<>();
        que.add(n);
        count[n] = 1;

        while (!que.isEmpty()) {
            int now = que.poll();

            for (int i=0; i<3; i++) {
                int next;

                if (i==0) next = now + 1;
                else if (i==1) next = now - 1;
                else next = now * 2;

                if (next == k) {
                    System.out.println(count[now]);
                    return;
                }

                if (next >= 0 && next < count.length && count[next] == 0) {  // 이동한 위치가 범위 안에 있고 방문한 적이 없으면 큐에 넣어주고 이전거리 + 1
                    que.add(next);
                    count[next] = count[now] + 1;
                }
            }
        }
    }
}