package DAY4.SESSION2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class NetworkDelayTime {
    public static int netWorkDelayTime(int[][] edges, int n, int k) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            graph.get(u).add(new int[] { v, w });
        }
        int[] distance = new int[n + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[k] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(new int[] { k, 0 });
        // Dijstra
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0];
            int time = curr[1];
            if (time > distance[node]) {
                continue;
            }
            for (int[] i : graph.get(node)) {
                int next = i[0];
                int weight = i[1];

                if (distance[node] + weight < distance[next]) {
                    distance[next] = distance[node] + weight;
                    pq.offer(new int[] { next, distance[next] });
                }
            }

        }
        int maxTime = 0;

        for (int i = 1; i <= n; i++) {
            if (distance[i] == Integer.MAX_VALUE) {
                return -1;
            }
            maxTime = Math.max(maxTime, distance[i]);
        }
        return maxTime;

    }

    public static void main(String[] args) {
        int[][] edges = {
                { 2, 1, 1 },
                { 2, 3, 1 },
                { 3, 4, 1 }
        };
        System.out.println(netWorkDelayTime(edges, 4, 2));
    }
}
