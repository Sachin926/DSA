import java.util.*;
class checkPath
{
	static class Edge
	{
		int src, nbr, wt;
		Edge(int src, int nbr, int wt)
		{
			this.src = src;
			this.nbr = nbr;
			this.wt = wt;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		ArrayList<Edge> graph[] = new ArrayList[v];
		for (int i = 0; i < v; i++)
			graph[i] = new ArrayList<Edge>();
		int ed = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < ed; i++)
		{
			String s = sc.nextLine();
			String in[] = s.split(" ");
			int v1 = Integer.parseInt(in[0]);
			int v2 = Integer.parseInt(in[1]);
			int wt = Integer.parseInt(in[2]);
			graph[v1].add(new Edge(v1, v2, wt));
			graph[v2].add(new Edge(v2, v1, wt));
		}
		int src = sc.nextInt();
		int dst = sc.nextInt();
		boolean visited[] = new boolean[v];
		Arrays.fill(visited, false);
	}
	public static boolean checkPath(ArrayList<Edge> graph[], int src, int dst, boolean visited[])
	{
		if (src == dst)
			return true;
		visited[src] = true;
		for (int i = 0; i < graph[src].size(); i++)
		{
			if (visited[graph[src].get(i).nbr] == false)
			if (checkPath(graph, graph[src].get(i).nbr, dst, visited) == true)
				return true;
		}
		return false;
	}
}