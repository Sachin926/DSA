import java.util.*;
class mergeOverlapping
{
	static class Intervals
	{
		int start, end;
		Intervals(int start, int end)
		{
			this.start = start;
			this.end = end;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Intervals> merge = new ArrayList<>();
		sc.nextLine();
		for (int i = 0; i < n; i++)
		{
			String s = sc.nextLine();
			String in[] = s.split(" ");
			merge.add(new Intervals(Integer.parseInt(in[0]), Integer.parseInt(in[1])));
		}
		sort(merge);
		Stack<Intervals> st = new Stack<>();
		st.push(merge.get(0));
		for (int i = 1; i < n; i++)
		{
			Intervals temp = st.peek();
			if (temp.end >= merge.get(i).start)
			{
				if (temp.end >= merge.get(i).end)
					continue;
				st.pop();
				temp.end = merge.get(i).end;
				st.push(temp);
			}
			else
			{
				st.push(merge.get(i));
			}
		}
		while (st.size() != 0)
		{
			System.out.println(st.peek().start + "-" + st.peek().end);
			st.pop();
		}
	}
	public static void sort(ArrayList<Intervals> merge)
	{
		for (int i = 0; i < merge.size(); i++)
		{
			for (int j = 0; j < merge.size(); j++)
			{
				if (merge.get(i).start <= merge.get(j).start)
				{
					Intervals temp = merge.get(i);
					merge.set(i, merge.get(j));
					merge.set(j, temp);
				}
			}
		}
	}
}