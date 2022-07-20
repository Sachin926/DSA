import java.util.*;
class prinAllPaths
{
	static class Edge
	{
		int src;
		int nbr;
		int wt;
		Edge(int src, int nbr, int wt)
		{
			this.src = src;
			this.nbr = nbr;
			this.wt = wt;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int v = sc.nextInt();
		ArrayList<Edge> graph[] = new ArrayList[v];
		for (int i = 0; i < v; i++)
			graph[i] = new ArrayList<Edge>();
		int edges = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < edges; i++)
		{
			String inp = sc.nextLine();
			String str[] = inp.split(" ");
			int v1 = Integer.parseInt(str[0]);
			int v2 = Integer.parseInt(str[1]);
			int wt = Integer.parseInt(str[2]);
			graph[v1].add(new Edge(v1, v2, wt));
			graph[v2].add(new Edge(v2, v1, wt));
		}
		int src = sc.nextInt();
		int dst = sc.nextInt();
		boolean visited[] = new boolean[v];
		Arrays.fill(visited, false);
		printAllPaths(graph, src, dst, visited, "" + src + ", ");
	}
	public static void printAllPaths(ArrayList<Edge> graph[], int src, int dst, boolean visited[], String res)
	{
		if (src == dst)
		{
			System.out.println(res);
			return;
		}
		visited[src] = true;
		for (int i = 0; i < graph[src].size(); i++)
		{
			if (visited[graph[src].get(i).nbr] == false)
			{
				printAllPaths(graph, graph[src].get(i).nbr, dst, visited, res + graph[src].get(i).nbr + ", ");
			}
		}
		visited[src] = false;
	}
}