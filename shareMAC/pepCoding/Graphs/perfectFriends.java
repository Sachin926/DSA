import java.util.*;
class perfectFriends
{
	static class Edge
	{
		int src, nbr;
		Edge(int src, int nbr)
		{
			this.src = src;
			this.nbr = nbr;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
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
			graph[v1].add(new Edge(v1, v2));
			graph[v2].add(new Edge(v2, v1));
		}
		boolean visited[] = new boolean[v];
		Arrays.fill(visited, false);
		ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
		for (int i = 0; i < v; i++)
		{
			if (visited[i] == false)
			{
				ArrayList<Integer> comp = new ArrayList<Integer>();
				getConnectedComp(graph, i, visited, comp);
				comps.add(comp);
			}
		}
		int count = 0;
		for (int i = 0; i < comps.size(); i++)
		{
			for (int j = i  + 1; j < comps.size(); j++)
			{
				count = count + comps.get(i).size() * comps.get(j).size();
			}
		}
		System.out.println(count);
	}
	public static void getConnectedComp(ArrayList<Edge> graph[], int src, boolean visited[], ArrayList<Integer> comp)
	{
		visited[src] = true;
		comp.add(src);
		for (int i = 0; i < graph[src].size(); i++)
		{
			if (visited[graph[src].get(i).nbr] == false)
			{
				getConnectedComp(graph, graph[src].get(i).nbr, visited, comp);
			}
		}
	}
}