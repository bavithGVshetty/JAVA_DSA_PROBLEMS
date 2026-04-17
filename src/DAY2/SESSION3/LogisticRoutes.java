package DAY2.SESSION3;

import java.sql.Array;
import java.util.*;

class Route {
    int src, dest, distance;

    Route(int src, int dest, int distance) {
        this.src = src;
        this.dest = dest;
        this.distance = distance;
    }

}

public class LogisticRoutes {
    public static void analyRoutes(List<Route> routes) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int total = 0;
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println(routes.get(1).src);
        for (Route r : routes) {
            int d = r.distance;
            min = Math.min(min, d);
            max = Math.max(max, d);
            total = total + d;

            // Count Connections
            map.put(r.src, map.getOrDefault(r.src, 0) + 1);
            map.put(r.dest, map.getOrDefault(r.dest, 0) + 1);
        }
        double avg = (double) total / routes.size();
        // Above Average your task

        System.out.println("Shortest Route: " + min);
        System.out.println("Longest Route: " + max);
        System.out.println("Total distance: " + total);
        System.out.println("Shortest Route: " + min);
        System.out.println("Average: " + avg);
        System.out.println("City Connections: ");
        for (int city : map.keySet()) {
            System.out.println("City " + city + "->" + map.get(city));
        }
    }

    public static void main(String[] args) {
        List<Route> routes = Arrays.asList(
                new Route(0, 1, 10),
                new Route(0, 2, 25),
                new Route(1, 2, 15),
                new Route(1, 3, 30),
                new Route(2, 3, 20));
        analyRoutes(routes);
    }

}
