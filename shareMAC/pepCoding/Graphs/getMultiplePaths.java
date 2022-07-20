import java.util.*;
class getMultiplePaths
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
		Scanner sc = new Scanner (System.in);
		int v = sc.nextInt();
		ArrayList<Edge> graph[] = new ArrayList[v];
		for (int i = 0; i < v; i++)
		{
			graph[i] = new ArrayList<Edge>();
		}
		int edges = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < edges; i++)
		{
			String s = sc.nextLine();
			String in[] = s.split();
			int v1 = Integer.parseInt(in[0]);
			int v2 = Integer.parseInt(in[1]);
			int wt = Integer.parseInt(in[2]);
			graph[v1].add(new Edge(v1, v2, wt));
			graph[v2].add(new Edge(v2, v1, wt));
		}
		int src = sc.nextInt();
		int dst = sc.nextInt();
		int criteria = sc.nextInt();
		int k = sc.nextInt();
		boolean visited[] = new boolean[v];
		Arrays.fill(visited, false);
	}
	static int sWt = Integer.MAX_VALUE;
	static int lWt = Integer.MIN_VALUE;
	static String sPath;
	static String lPath;
	static String ceilPath;
	static String floorPath;
	static int ceilWt = Integer.MAX_VALUE;
	static int floorWt = Integer.MIN_VALUE;
	public static void getMultiple(ArrayList graph[], int src, int dst, String res, int wt, int criteria, boolean visited[])
	{
		if (src == dst)
		{
			if (wt < swt)
			{
				sWt = wt;
				sPath = res;
			}
			if (wt > lWt)
			{
				lWt = wt;
				lPath = res;
			}
			if (criteria < wt && wt < ceilWt)
			{
				ceilPath = res;
				ceilWt = wt;
			}
			if (criteria > wt && wt > floorWt)
			{
				floorPath = res;
				floorWt = wt;
			}
			return;
		}
		visited[src] = true;
		for (int i = 0; i < graph[src].size(); i++)
		{
			if (visited[graph[src].get(i).nbr == false])
			{
				printMultiple(graph, graph[src].get(i).nbr, dst, res + graph[src].get(i).nbr,
				 wt + graph[src].get(i).wt, criteria, visited)
			}
		}
	}
}