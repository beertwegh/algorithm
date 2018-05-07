public class traincost {


    static int INF = Integer.MAX_VALUE, N = 4;


    static int minCost(int cost[][]) {

        int dist[] = new int[N];
        for (int i = 0; i < N; i++)
            dist[i] = INF;
        dist[0] = 0;


        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (dist[j] > dist[i] + cost[i][j])
                    dist[j] = dist[i] + cost[i][j];

        return dist[N - 1];
    }


    public static void main(String args[]) {
        int cost[][] = {{0, 15, 80, 90},
                {INF, 0, 40, 50},
                {INF, INF, 0, 70},
                {INF, INF, INF, 0}
        };
        System.out.println(" #1 The Minimum cost to reach station " + N +
                " is " + minCost(cost));


        int cost2[][] = {{0, 20, 90, 120},
                {INF, 0, 50, 60},
                {INF, INF, 0, 80},
                {INF, INF, INF, 0}
        };
        System.out.println(" #2 The Minimum cost to reach station " + N +
                " is " + minCost(cost2));
    }

}
