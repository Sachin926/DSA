import java.util.*;
class getHamiltonian
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
			graph[i] = new ArrayList<Edge>();
		int edges = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < edges; i++)
		{
			String s = sc.nextLine();
			String in[] = s.split(" ");
			int v1 = Integer.parseInt(in[0]);
			int v2 = Integer.parseInt(in[1]);
			int wt = Integer.parseInt(in[2]);
			graph[v1].add(new Edge(v1, v2, wt));
			graph[v2].add(new Edge(v2, v1, wt));
		}
		boolean visited[] = new boolean[v];
		Arrays.fill(visited, false);
		ArrayList<String> ham = new ArrayList<String>();
		getHamiltonian(graph, 0, visited, ham, "0");
		System.out.println(ham);
	}
	public static boolean checkTrue(boolean a[])
	{
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == false)
				return false;
		}
		return true;
	}
	public static void getHamiltonian(ArrayList<Edge> graph[], int src, boolean visited[], ArrayList<String> ham, String res)
	{
		visited[src] = true;
		if (checkTrue(visited) == true)
		{
				ham.add(res);
		}
		for (int i = 0; i < graph[src].size(); i++)
		{
			if (visited[graph[src].get(i).nbr] == false)
			{
				getHamiltonian(graph, graph[src].get(i).nbr, visited, ham, res + graph[src].get(i).nbr);
			}
		}
		visited[src] = false;
	}
}