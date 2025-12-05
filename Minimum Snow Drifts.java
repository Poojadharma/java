//  Minimum Snow Drifts
// Problem Statement:
// Vishal is learning to skate on ice. He's a beginner, so his only mode of transportation is pushing off from a snow drift to the north, east, south or west and sliding until he lands in another snow drift. He has noticed that in this way it's impossible to get from some snow drifts to some other by any sequence of moves. He now wants to heap up some additional snow drifts, so that he can get from any snow drift to any other one. He asked you to find the minimal number of snow drifts that need to be created. We assume that Vishal can only heap up snow drifts at integer coordinates.

import java.util.*;

public class Main {

    static int n;
    static int[][] pts;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        pts = new int[n][2];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            pts[i][0] = sc.nextInt();  // x
            pts[i][1] = sc.nextInt();  // y
        }

        int components = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                components++;
                dfs(i);
            }
        }

        System.out.println(components - 1);
    }

    static void dfs(int i) {
        visited[i] = true;

        for (int j = 0; j < n; j++) {
            if (!visited[j]) {
                // connected if same x or same y
                if (pts[i][0] == pts[j][0] || pts[i][1] == pts[j][1]) {
                    dfs(j);
                }
            }
        }
    }
}