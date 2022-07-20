import java.util.*;
class test {
    static private class Edge {
        int src, int nbr, int wt;
        Edge (int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int edges = sc.nextInt();
        ArrayList<Edge> graph[] = new ArrayList[v];
        for (int i = 0; i < edges; i++) {
            String in[] = (sc.nextLine()).split(" ");
            int v1 = Integer.parseInt(in[0]);
            int v2 = Integer.parseInt(in[1]);
            int wt = Integer.parseInt(in[2]);
            graph[v1].add(new Edge(v1, wt, v2));
            graph[v2].add(new Edge(v2, wt, v1));
        }
    }
}