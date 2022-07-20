def unBoundedKnapsack(wt, val, w):
	n = len(wt)
	t = [[None for i in range (w + 1)] for i in range (n + 1)]
	for i in range(w + 1):
		for j in range(n + 1):
			if (i == 0 or j == 0):
				t[i][j] = 0
	for i in range (1, w + 1):
		for j in range (1, n + 1):
			if (wt[i - 1] <= j):
				t[i][j] = max (t[i - 1][j], val[i - 1] + t[i][j - wt[i - 1]])
			else:
				t[i][j] = t[i - 1][j]
	return t[n][sum]