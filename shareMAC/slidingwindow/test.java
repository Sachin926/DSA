import java.util.*;
class test {
	private static class Edge {
		int src, nbr, wt;
		Edge(int src, int wt, int nbr) {
			this.src = src;
			this.wt = wt;
			this.nbr = nbr;
		}
	}
	private static class Pair implements Comparable<Pair> {
		int wsf;
		String psf;
		Pair(int wsf, String psf) {
			this.wsf = wsf;
			this.psf = psf;
		}
		@Override
		public int compareTo(Pair o) {
			return this.wsf - o.wsf;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vtces = sc.nextInt();
		int edges = sc.nextInt();
		ArrayList<Edge>[] graph = new ArrayList[vtces];
		for (int i = 0; i < vtces; i++)
			graph[i] = new ArrayList<Edge>();
		sc.nextLine();
		for (int i = 1; i <= edges; i++) {
			String s = sc.nextLine();
			String in[] = s.split(" ");
			int v = Integer.parseInt(in[0]);
			int u = Integer.parseInt(in[1]);
			int wt = Integer.parseInt(in[2]);
			graph[v].add(new Edge(v, wt, u));
			graph[u].add(new Edge(u, wt, v));
		}
		int src = sc.nextInt();
		int dst = sc.nextInt();
		int k = sc.nextInt();
		path = "";
		swt = Integer.MIN_VALUE;
		secondSmallest = 0;
		boolean[] visited  = new boolean[vtces];
		Arrays.fill(visited, false);
		getSmallest(k, graph, src, dst, visited, 0, src + "");
		System.out.println(pq.peek().psf + "@" + pq.peek().wsf);
	}
	static int secondSmallest = 0;
	static String path = "";
	static int swt = Integer.MAX_VALUE;
	static PriorityQueue<Pair> pq = new PriorityQueue<>();
	public static void getSmallest(int k, ArrayList<Edge>[] graph, int src, int dst, boolean[] visited, int small, String res) {
		if (src == dst) {
			if (pq.size() < 4) {
				pq.add(new Pair(small, res));
			}
			else {
				if (small > pq.peek().wsf) {
					pq.remove();
					pq.add(new Pair(small, res));
				}
			}
		}
		visited[src] = true;
		for (int i = 0; i < graph[src].size(); i++) {
			if (visited[graph[src].get(i).nbr] == false) {
				getSmallest(k, graph, graph[src].get(i).nbr, dst, visited,
				 small + graph[src].get(i).wt, res + graph[src].get(i).nbr);
			}
		}
		visited[src] = false;
	}
}