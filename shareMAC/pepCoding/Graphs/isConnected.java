import java.util.*;
class isConnnected
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
		ArrayList <Edge> graph[] = new ArrayList[v];
		for (int i = 0; i < v; i++)
		{
			graph[i] = new ArrayList<Edge>();
		}
		int edges = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < edges; i++)
		{
			String s = sc.nextLine();
			String in[] = s.split(" ");
			int v1 = Integer.parseInt(in[0]);
			int v2 = Integer.parseInt(in[2]);
			int wt = Integer.parseInt(in[2]);
			graph[v1].add(new Edge(v1, v2, wt));
			graph[v2].add(new Edge(v2, v1, wt))			
		}
		boolean visited[] = new boolean[v];
		Arrays.fill(visited, false);
		ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
		for (int i = 0; i < v; i++)
		{
			if (visited[i] == false)
			{
				ArrayList<Integer> comp = new ArrayList<Integer>();
				getComp(graph, 0, visited, comp);
				comps.add(comp);
			}
		}
		if (comps.size() == 1)
			System.out.println("True");
		else
			System.out.println("False");
	}
	public static getComp(ArrayList<Edge> graph[], int src, boolean visited[], ArrayList<Integer> comp[])
	{
		visited[src] = true;
		comp.add(src);
		for (int i = 0; i < graph[src].size(); i++)
		{
			if (visited[graph[src].get(i).nbr == false])
			{
				getComp(graph, graph[src].get(i).nbr, visited, comp);
			}
		}
	}
}