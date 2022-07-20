import java.util.*;
class test {
	private static class Edge {
		int src, nbr;
		Edge(int src, int nbr) {
			this.src = src;
			this.nbr = nbr;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		ArrayList<Edge> graph[] = new ArrayList[n + 1];
		for (int i = 0; i < n + 1; i++) {
			graph[i] = new ArrayList<Edge>();
		}
		int hide[] = new int[h];
		for (int i = 0; i < h; i++) {
			hide[i] = sc.nextInt();
		}
		sc.nextLine();
		for (int i = 1; i <= n - 1; i++) {
			String s = sc.nextLine();
			String in[] = s.split(" ");
			int v = Integer.parseInt(in[0]);
			int u = Integer.parseInt(in[1]);
			graph[v].add(new Edge(v, u));
			graph[u].add(new Edge(u, v));
		}
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for (int i = 0; i < h - 1; i++) {
			for (int j = i + 1; j < h; j++) {
				swt = Integer.MIN_VALUE;
				boolean[] visited = new boolean[n + 1];
				Arrays.fill(visited, false);
				getPath(graph, hide[i], hide[j], 0, visited);
				if (q.size() < h / 2) {
					q.add(swt);
				}
				else {
					if (swt > q.peek()) {
						q.remove();
						q.add(swt);
					}
				}
			}
		}
		int sum = 0;
		while (q.size() > 0) {
			sum = sum + q.remove();
		}
		System.out.println(sum);
	}
	static int swt = Integer.MIN_VALUE;
	static void getPath(ArrayList<Edge> graph[], int src, int dst, int wsf, boolean[] visited) {
		if (src == dst) {
			if (wsf > swt) {
				swt = wsf;
			}
		}
		visited[src] = true;
		for (int i = 0; i < graph[src].size(); i++) {
			if (visited[graph[src].get(i).nbr] == false) {
				getPath(graph, graph[src].get(i).nbr, dst, wsf + 1, visited);
			}
		}
	}
}